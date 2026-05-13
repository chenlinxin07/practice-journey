package upperpart.StringDemo.String;


import java.util.Scanner;

public class ConcatenateStrings {

//定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
//并在控制台输出结果。例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        String result = ConcatenateString(arr);
        System.out.println(result);
    }

    public static String ConcatenateString(int []arr){
        if(arr == null){
            System.out.println("该字符串不存在");
        }
        if(arr.length<1){
            System.out.println("该字符串长度为零");
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if(i!=arr.length-1){
                result += ",";
            }
        }
        result += "]";
        return result;
    }
}
