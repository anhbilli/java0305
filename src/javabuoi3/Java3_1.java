package javabuoi3;

import java.util.Arrays;

public class Java3_1 {
            public static void main(String[] args) {
                int arr1[]= {1,2,3,4};
                int arr2[]= {2,5,7,8};
                int arrResult[]=tronMang(arr1,arr2);
                //Sắp xếp mảng
                Arrays.sort(arrResult);
                docMang(arrResult);
            }

            private static void docMang(int[] mang) {
                for(int i=0;i<mang.length;i++)
                    System.out.print(mang[i]+ " ");
            }


            private static int[] tronMang(int[] arr1, int[] arr2) {
                //Tạo mảng mới có độ dài bằng arr1.length + arr2.length
                int mangDaTron[]=new int[arr1.length+arr2.length];
                //thêm mảng arr1
                for(int i=0;i<arr1.length;i++)
                    mangDaTron[i]=arr1[i];
                //thêm arr2 tiếp theo sau vị trí cuối cùng của arr1
                for(int i=arr1.length;i<mangDaTron.length;i++)
                    mangDaTron[i]=arr2[i-arr1.length];
                return mangDaTron;
            }

        }



