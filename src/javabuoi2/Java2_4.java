package javabuoi2;

public class Java2_4 {
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
         for(int element : arrayNumber){
             System.out.println(element);
        }
    }
}
