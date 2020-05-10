package javabuoi1;

import java.util.Scanner;
import java.lang.String;

public class Java1_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b =  Integer.valueOf(a);
        int c = b*11;
        int d = b*111;
        int e = b + c + d;
        System.out.println((a+ '+' +(a + a)+ '+' +(a + a + a)+ '=') + e );

    }
}
