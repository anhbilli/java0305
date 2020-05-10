package javabuoi2;

import apple.laf.JRSUIConstants;

import java.util.Scanner;

public class Java2_2 {
    public static void main(String[] args){
        System.out.println("nhap n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TamGiacCan(n);

    }
    public static void TamGiacCan(int n){
        //dong i

        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n * 2 - 1); j++) {
                if (j >= ((n - i) + 1) && j <= ((n + i) - 1)) {
                    System.out.print('*');;
                } else {
                    System.out.print(' ');;
                }
            }

            System.out.println("");
        }



    }
}
