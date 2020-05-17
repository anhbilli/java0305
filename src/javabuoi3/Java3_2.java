package javabuoi3;

public class Java3_2 {
    public static void main(String[] args) {
        int array[]= {20, 20, 30, 40, 50, 50, 50};
        int arrayResult[ ]= new int[array.length];
        int spt=0;
        boolean check=false; //array i có trong arrayResult
        //Duyệt array
        for(int i=0;i<array.length;i++) {
            check=false; //reset lại giá trị biến
            for(int j=0;j<arrayResult.length;j++)
                if(arrayResult[j]==array[i])
                    check=true; //có trùng
            //nếu array thứ i chưa có trong mảng arrayResult (không trùng)
            if(check==false) {
                arrayResult[spt]=array[i];
                spt++;
            }
			/*if(kiemTraTrung(arrayResult,array[i])==false) {
				arrayResult[spt]=array[i];
				spt++;
			}*/
        }
        for(int i=0;i<spt;i++)
            System.out.print(arrayResult[i]+" ");
    }

    private static boolean kiemTraTrung (int[] array, int number) {
        //duyệt từng phần tử trong array
        for(int x:array) {
            if(x==number)
                return true;
        }
        return false;
    }

}


