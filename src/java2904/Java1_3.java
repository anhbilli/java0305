package java2904;

import java.util.Scanner;
public class Java1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        int value1 = scanner.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        int value2 = scanner.nextInt();
        System.out.println("125 + 24 = "+ (value1 + value2));
        System.out.println("125 - 24 = "+ (value1 - value2));
        System.out.println("125 * 24 = "+ (value1 * value2));
        System.out.println("125 / 24 = "+ (value1 / value2));
        System.out.println("125 mod 24 = "+ (value1 % value2));
    }
}
