package javabuoi4.BaiTap4_2;

import javabuoi4.Student;

public class StudentManagement {
    private int tongSV;
    private Student[] students;

    public StudentManagement(Student[] students) {
        this.students = students;
        this.tongSV = this.students.length;
    }

    public StudentManagement() {
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
            }
        }

        return sum;
    }
    //In ra DSach SV truot
    public int inRaSVTruot(){
        int sum = 0;
        for(int i = 0; i < tongSV; i++){
            if(students[i].kiemTra() == false){
                sum += 1;
            }
            }


        return sum;
    }
    //Dem tong so SV do
    public Student diemGPACao(){
        float max = 0;
        Student SV = new Student();
        for(int i = 0; i < tongSV; i++){
            if(students[i].getGpa() > max){
                max = students[i].getGpa();
                SV = students[i];
            }
        }
        return SV;


    }
    
    //Dem tong so SV truot
    public Student diemGPAMin(){
        float min = students[0].getGpa();
        Student SV = new Student();
        SV = students[0] ;
        for(int i = 1; i < tongSV; i++){
            if(min > students[i].getGpa()){
                min = students[i].getGpa();
                SV = students[i];
            }
        }
        return SV;


    }


}
