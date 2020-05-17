package javabuoi3;

import java.util.Scanner;

public class Ex1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            char c = sc.next().charAt(0);
            int answer = 0;
            //in ra số lần xuất hiện của ký tự c trong xâu s.
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == c) {
                    answer ++;
                }
            }
            System.out.print(answer);
        }
}
