package java2904;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//tuong tac man hinh console
        System.out.println("Moi nhap vao ten cua ban: ");//Nhap ten bien chua dau vie thuong chu tiep viet hoa
        String name = scanner.nextLine();//scanner laf gia tri nguoi dung nhapvao
        System.out.println("Nhap vao tuoi : ");
        int age = scanner.nextInt();
        age = age + 10;
        System.out.println("Ten nguoi dung nhap vao la: "+ name+",tuoi vua nhap la: "+age);
        //scanner.nextLine("anh");
        //scanner.nextInt(1);

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao link: ");
        String link = scanner.nextLine();
*/

        //Cach 1 cung kieu
        //int a = 200;
        //byte b = (byte) a; //Ep kieu tu to sang nho nen chu y

        //Cach 2 khac kieu
        //String a = "200";
        //int b = Integer.valueOf(a);

        //System.out.println(b);

    }
}
