package javabuoi4.BaiTap4_2;

import javabuoi4.Student;

public class StudentManagement {
    private int tongSV;
    private Student[] students;

    public StudentManagement(Student[] students) {
        this.students = students;
        this.tongSV = this.students.length;
    }

    public int getTongSV() {
        return tongSV;
    }

    public void setTongSV(int tongSV) {
        this.tongSV = tongSV;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    //In ra DSach SV do
    public int inRaSVDo(){
        int sum = 0;
        for(int i = 0; i < tongSV; i++){
            if(students[i].kiemTra() == true){
                sum += 1;
            } else{
                sum =sum + 0;
        }
        int inRaSVDo = sum;
        return inRaSVDo;
    }
    //In ra DSach SV truot
    public int inRaSVTruot(){
        int sum2 = 0;
        for(int i = 0; i < tongSV; i++){
            if(students[i].kiemTra() == false){
                sum2 += 1;
            } else{
                sum2 =sum2 + 0;
            }
        }
        int inRaSVTruot = sum2;
        return inRaSVTruot;
    }
    //Dem tong so SV do
    public int diemGPACao(){
        float max = 0;
        String diemGPACao = " ";
        for(int i = 0; i < tongSV; i++){
            if(students[i].getGpa() > max){
                max = students[i].getGpa();
                diemGPACao = students[i].getName();
            }
        }
            System.out.println("SV co GPA cao nhat la : "+diemGPACao);

    }
    
    //Dem tong so SV truot


}
