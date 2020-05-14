package javabuoi3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Java3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = sc.nextInt();
        //Khai bao mang a kieu so nguoi vs 10 phan tu
        int[] a = new int[n];

        //Dung vong lap for de nhap DL

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        //Dung vong for de hien thi cac phan tu trong mang
        System.out.println("Mang a la: ");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        //Tinh trung binh cong cac so le o vi tri chan
        int avg = 0;
        for (int i = 0; i < n; i++){
            if(a[i] % 2 != 0 && (i+1) % 2 == 0){
                int j = a.length();
                avg += a[i]/j;
            }
        }
        System.out.println("Trung binh cong: "+avg);

        //Phan tu lon nhat trong mang
        int maxValue = a[0];
        for(int i = 0; i < n;i++){
            if(a[i] > maxValue){
                maxValue = a[i];
            }
        }
        System.out.println("Phan tu lon nhat la: "+maxValue);

        //Vi tri so nho nhat trong mang
       /* int minValue = a[0];
        for(int i = 0; i < n; i++){
            if(a[i] < minValue){
                minValue = a[i];
            }
        }
        System.out.println(minValue.length);*/

    }
}
