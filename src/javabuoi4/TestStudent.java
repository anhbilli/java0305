package javabuoi4;

public class TestStudent {
    public static void main(String[] args) {
        Student SV1 = new Student("Nguyen Van A", 2);
        Student SV2 = new Student("Nguyen Van B", 1);

        //Kiem tra do/ truot
        System.out.println("Kiem tra do/truot cua SV2 la: "+SV2.kiemTra());
        System.out.println("Kiem tra do/truot cua SV1 la: "+SV1.kiemTra());

        //In thong tin
        System.out.println("Thong tin SV1 la: "+SV1.getName()+ "-"+SV1.getGpa());
        System.out.println("Thong tin SV2 la: "+SV2.getName()+ "-"+SV2.getGpa());

    }
}

