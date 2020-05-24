package javabuoi4;

public class Test1 {
    public static void main(String[] args) {
        Oto oTo1 = new Oto("Z10","Huyndai",10000000);
        Oto[] otos = new Oto[3];
        otos[0] = oTo1;
        otos[1] = new Oto("Z11","Toyota",20000000);
        otos[2] = new Oto("Z12","Honda",5000000);

        Oto tem;
        for(int i = 0; i < otos.length;i++) {
            for (int j = 0; j < otos.length; j++) {
                if (otos[i].getPrice() < otos[j].getPrice()) {
                    tem = otos[i];
                    otos[i] = otos[j];
                    otos[j] = tem;
                }

            }
        }
        for (Oto kq : otos) {
            System.out.println(kq.getName() + "-" + kq.getPrice());
        }

    }



}
