package upperpart.StringDemo.String;

public class Test {
    static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2+"c";
        String s4 = "a"+"b"+"c";
        System.out.println(s1==s2);
        System.out.println(s1==s4);

        char c = '5';
        int n = (int)c;
        int a = c-48;
        System.out.println(n+","+a);

    }
}
