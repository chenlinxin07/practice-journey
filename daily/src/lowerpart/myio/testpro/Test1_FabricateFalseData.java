package lowerpart.myio.testpro;

import cn.hutool.http.HttpUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1_FabricateFalseData {
    static void main(String[] args) throws IOException {
        /*
         制造假数据：
             获取姓氏：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
             获取男生名字：http://www.haoming8.cn/baobao/10881.html
             获取女生名字：http://www.haoming8.cn/baobao/7641.html
        */

//1.记录网站
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,familyNameNet,boyNameNet,girlNameNet);


//2.爬取数据
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(webCrawler(list.get(i))) ;
        }

//3.获取符合要求的数据
        //姓
        ArrayList<String> familyNameTempList = getData(list1.getFirst(), "([\\u4E00-\\u9FA5]{4})[，。]", 1);
        familyNameTempList.remove("子渠道号");
        familyNameTempList.remove("经被定义");
        //名
        ArrayList<String> boyNameTempList = getData(list1.get(1),"([\\u4E00-\\u9FA5]{2})(、|。)",1);
        ArrayList<String> girlNameTempList = getData(list1.get(2),"(.. ){4}..",0);


//4.处理数据
        //familyNameTempList（姓氏）
        //处理方案：把每一个姓氏拆开并添加到一个新的集合当中
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            //str 赵钱孙李  周吴郑王   冯陈褚卫   蒋沈韩杨
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                familyNameList.add(c + "");
            }
        }
        //boyNameTempList（男生的名字）
        //处理方案：去除其中的重复元素
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String str : boyNameTempList) {
            if(!boyNameList.contains(str)){
                boyNameList.add(str);
            }
        }
        //girlNameTempList（女生的名字）
        //处理方案：把里面的每一个元素用空格进行切割，得到每一个女生的名字
        ArrayList<String> girlNameList = new ArrayList<>();

        for (String str : girlNameTempList) {
            String[] arr = str.split(" ");
            girlNameList.addAll(Arrays.asList(arr));
        }

//5.生成数据
        //姓名（唯一）-性别-年龄
        ArrayList<String> list2 = getInfos(familyNameList, boyNameList, girlNameList, 70, 50);
        Collections.shuffle(list2);
        System.out.println(list2);

//6.写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("daily/src/lowerpart/myio/names.txt"));
        for (String str : list2) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }




    //爬取数据
    public static String webCrawler(String net){
        String boyHtml = HttpUtil.get(net);
        return boyHtml;
    }




    //生成信息
    /*
     * 作用：
     *      获取男生和女生的信息：张三-男-23
     *
     * 形参：
     *      参数一：装着姓氏的集合
     *      参数二：装着男生名字的集合
     *      参数三：装着女生名字的集合
     *      参数四：男生的个数
     *      参数五：女生的个数
     * */
    public static ArrayList<String> getInfos(ArrayList<String> familyNameList,ArrayList<String> boyNameList,ArrayList<String> girlNameList, int boyCount,int girlCount){
        //1.生成男生不重复的名字
        HashSet<String> boyhs = new HashSet<>();
        while (boyhs.size() != boyCount) {
            //随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);
            boyhs.add(familyNameList.getFirst() + boyNameList.getFirst());
        }
        //2.生成女生不重复的名字
        HashSet<String> girlhs = new HashSet<>();
        while (girlhs.size() != girlCount) {
            //随机
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);
            girlhs.add(familyNameList.getFirst() + girlNameList.getFirst());
        }
        //3.生成男生的信息并添加到集合当中
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        //【17~25】
        for (String boyName : boyhs) {
            //boyName依次表示每一个男生的名字
            int age = r.nextInt(17,25);
            list.add(boyName + "-男-" + age);
        }
        //4.生成女生的信息并添加到集合当中
        //【18 ~ 25】
        for (String girlName : girlhs) {
            //girlName依次表示每一个女生的名字
            int age = r.nextInt(18,25);
            list.add(girlName + "-女-" + age);
        }
        return list;
    }




    //获取符合要求的数据
    /*
     * 作用：根据正则表达式获取字符串中的数据
     * 参数一：
     *       完整的字符串
     * 参数二：
     *       正则表达式
     * 参数三：
     *      获取数据
     *       0：获取符合正则表达式所有的内容
     *       1：获取正则表达式中第一组数据
     *       2：获取正则表达式中第二组数据
     *       ...以此类推
     *
     * 返回值：
     *       真正想要的数据
     *
     * */
    private static ArrayList<String> getData(String str, String regex,int index) {
        //1.创建集合存放数据
        ArrayList<String> list = new ArrayList<>();
        //2.按照正则表达式的规则，去获取数据
        Pattern pattern = Pattern.compile(regex);
        //按照pattern的规则，到str当中获取数据
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            list.add(matcher.group(index));
        }
        return list;
    }
}
