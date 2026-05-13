package upperpart.commonalgorithms.Lamda;

import java.util.Arrays;
import java.util.Comparator;

public class LamdaTest  {
    static void main(String[] args) {
        String[] arr = {"aa","aaa","a","aaaa"};
        //匿名内部类写法
        //Arrays.sort如果只传数组就是默认的快速升序排序,
        //如果传了第二个参数,那Arrays.sort就用这个对象里的排序方法
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(Arrays.toString(arr));


        String[] arr2 = {"aa","aaa","a","aaaa"};
        //lamda写法
        Arrays.sort(arr2,(o1,o2)->o1.length()-o2.length());
        System.out.println(Arrays.toString(arr2));
    }
}
