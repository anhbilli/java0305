package javabuoi3;

public class bai1 {
    public static void main(String[] args) {
        int[] arrayNumber =  new int[5];
        //int[] arrayNumber2 = {5, 10, 4, 3, 7};
        //for each chi lay ra gia tri
        //for (int element : arrayNumber2);
        //System.out.print(element);


        //cho vao gia tri cua mang sd for
        for(int i = 0; i<arrayNumber.length; i++){
            arrayNumber[i] = 10;
        }
        //element la gia tri phan tu mang
        for(int element : arrayNumber){
            System.out.println(element);
        }
    }
}


