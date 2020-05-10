package javabuoi2;

public class Java2_1 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int k = 1;

        for(; i <= 100;i++) {
            if (i % 3 == 0)
                System.out.println("Divided by 3:" +i);
        }
        for (;j <= 100;j++){
            if(j % 5 == 0)
                System.out.println("Divided by 5:" +j);
        }
        for (;k <= 100;k++){
            if(k % 3 == 0 && k % 5 == 0)
                System.out.println("Divided by 3 and 5:" +k);
        }


    }
}

