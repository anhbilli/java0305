package javabuoi4;

public class Test {
    public static void main(String[] args) {
        Student sinhVien1 = new Student("Nguyen Van A", 20);

        Student [] sinhviens = new Student[3];
        sinhviens[0] = sinhVien1;
        sinhviens[1] = new Student("Nguyen Van B",23);
        sinhviens[2] = new Student("Nguyen Van C", 26);

        Student tem;
        for (int i = 0; i < sinhviens.length;i++){
            for(int j = i+1; j < sinhviens.length;j++){
                if (sinhviens[i].getAge() < sinhviens[j].getAge()) {
                    tem = sinhviens[i];
                    sinhviens[i] = sinhviens[j];
                    sinhviens[j] = tem;
                }
            }
        }
        for(Student a : sinhviens){
            System.out.println(a.getName() +"-"+a.getAge());

        }

    }

}
