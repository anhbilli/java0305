package javabuoi2;

import java.util.Scanner;

public class Java2_3 {
    public static void main(String[] args) {
        System.out.println("nhap i: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        System.out.println(avg(sum(n),n));



    }
    public static int sum(int n){
        int tong = 0;

        for (int i = 0;i<=n;i++)
        tong+=i;
        return tong;

    }
    public static double avg(int tong, int n){
        double trungBinh = (double) tong/n;
        return trungBinh;
    }
}
