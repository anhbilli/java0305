package javabuoi2;

public class Exersice1 {
    int a = 10;//BIen toan cuc instance

    static int STATIC_VARIABLE = 20;//Bien tinh khong thay doi
    static final int CONSTANT = 30;


    public static void main(String[] args) {
        int b = 20;//BIen cuc bo local
        Exersice1 ob = new Exersice1();
        ob.print();

        int result = ob.getAValue();
        System.out.println(result);
        System.out.println("Gia tri cua b: "+ b);
    }
    void print(){
        int c = 30;//Bien cuc bo local
        System.out.println("Bien a la: "+ a);

    }
    int getAValue(){

        return a = 55;
    }
}
