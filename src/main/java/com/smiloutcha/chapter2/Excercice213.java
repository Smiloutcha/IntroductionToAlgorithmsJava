package com.smiloutcha.chapter2;

import java.util.Arrays;

public class Excercice213 {


    public static void main(String[] args) {
        int[] arr =new int[]{31,41,59,26,41,58};
        System.out.println("Array before Sorting " + Arrays.toString(arr));
        applyInsertionSortNonIncreasingOrder(arr);
        System.out.println("Array After Execution Insertion Sort in non Increasing order : " + Arrays.toString(arr));
        System.out.println("Expected Result After execution Insertion Sort in non Increasing Order : "+ "[59, 58, 41, 41, 31, 26]" );

    }



    public static void applyInsertionSortNonIncreasingOrder(int[] arr) {
        for (int i = 1 ; i< arr.length ; i++) {
            int key = arr[i] ;
            int j = i - 1 ;
            while (j >= 0 && arr[j] < key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key ;
        }
    }

}
