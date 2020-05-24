package javabuoi4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestHCN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hight la: ");
        int Height = sc.nextInt();
        System.out.println("Width la: ");
        int Width = sc.nextInt();

        //Tinh chu vi HCN
        HinhChuNhat hinhchunhat = new HinhChuNhat(Width, Height);
        System.out.println("Chu vi HCN: "+ hinhchunhat.chuVi());

        //Tinh dien tich HCN
        System.out.println("Dien tich HCN la: "+ hinhchunhat.dienTich());

        //Kiem tra Hinh Vuong
        System.out.println("Kiem tra Hinh Vuong: "+ hinhchunhat.checkHV());

    }
}
