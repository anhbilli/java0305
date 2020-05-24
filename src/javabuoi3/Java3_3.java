package javabuoi3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Java3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = sc.nextInt();
        //Khai bao mang a kieu so nguyen vs 10 phan tu
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
        //1.Tinh trung binh cong cac so le o vi tri chan
        int avg = 0;
        int m = 0;
        for (int i = 0; i < n; i++){
            if(a[i] % 2 != 0 && (i+1) % 2 == 0){
                avg += a[i];
                m++;
            }
        }
        float avg2 = avg/m;

        System.out.println("Trung binh cong: "+avg2);

        //2.Phan tu lon nhat trong mang
        int maxValue = 0;
        for(int i = 0; i < n;i++){
            for (int j = 0; j < n;j++){
                if(a[i] > maxValue) {
                maxValue = a[i];
                a[i] = a[j];
                a[j] = maxValue;
                }
            }
        }
        System.out.println("Phan tu lon nhat la: "+maxValue);

        //3.Vi tri so nho nhat trong mang
       int minA = a[0];
       int minIndex = 0;
        for(int i = 0; i < n; i++){
               if(a[i] < minA) {
                   minA = a[i];
                   minIndex = i;
               }
        }
        System.out.println("Vi tri so nho nhat trong mang: "+minIndex);


        //8.Sap xep mang theo thu tu giam dan
        System.out.println("Mang theo thu tu giam dan: ");
        int giamDan;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] > a[j]){
                    giamDan = a[i];
                    a[i] = a[j];
                    a[j] = giamDan;

                }
            }
        }
        for(int b : a) {
            System.out.print(b+ " ");
        }

    }
}
