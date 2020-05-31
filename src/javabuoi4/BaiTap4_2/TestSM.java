package javabuoi4.BaiTap4_2;

import javabuoi4.Student;

import java.util.Scanner;

public class TestSM {
    public static void main(String[] args){
        System.out.println("Nhap vao so SV: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Nhap vao ten SV thu "+(i + 1));
            String name = sc.nextLine();
            System.out.println("Nhap vao gpa SV thu "+(i + 1));
            float gpa = sc.nextFloat();
            sc.nextLine();
            students[i] = new Student(name, gpa);
        }
        StudentManagement studentManagement = new StudentManagement(students);
        System.out.println(studentManagement.inRaSVDo());
        System.out.println(studentManagement.inRaSVTruot());

        Student gpaMax = studentManagement.diemGPACao();
        System.out.println("SV co GPA cao nha la: "+gpaMax.toString());

        Student gpaMin = studentManagement.diemGPAMin();
        System.out.println("SV co GPA nho nhat la:"+gpaMin.toString());




    }

}
