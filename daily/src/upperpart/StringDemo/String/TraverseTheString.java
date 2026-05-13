package upperpart.StringDemo.String;

import java.util.Scanner;

public class TraverseTheString {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = sc.next();
        char []arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
