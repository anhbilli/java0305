package javabuoi4;

public class Test {
    public static void main(String[] args) {
        Student1 sinhVien1 = new Student1("Nguyen Van A", 20);

        Student1[] sinhviens = new Student1[3];
        sinhviens[0] = sinhVien1;
        sinhviens[1] = new Student1("Nguyen Van B",23);
        sinhviens[2] = new Student1("Nguyen Van C", 26);

        Student1 tem;
        for (int i = 0; i < sinhviens.length;i++){
            for(int j = i+1; j < sinhviens.length;j++){
                if (sinhviens[i].getAge() < sinhviens[j].getAge()) {
                    tem = sinhviens[i];
                    sinhviens[i] = sinhviens[j];
                    sinhviens[j] = tem;
                }
            }
        }
        for(Student1 a : sinhviens){
            System.out.println(a.getName() +"-"+a.getAge());

        }

    }

}
