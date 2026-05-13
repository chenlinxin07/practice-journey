package upperpart.StringDemo.String;

import java.util.Scanner;

public class SensitiveWordReplacement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.next();
        String[] sensitiveWord = {"tmd","sb","wq","yb","nmd"};
        for (int i = 0; i < sentence.length(); i++) {
            String result = sentence.replace(sensitiveWord[i],"***");
        }
    }
}
