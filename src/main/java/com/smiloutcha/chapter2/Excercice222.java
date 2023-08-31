package com.smiloutcha.chapter2;

import java.util.Arrays;

public class Excercice222 {

    public static void main(String[] args) {
        int[] arr =new int[]{31,41,59,26,41,58};
        System.out.println("Array before Sorting " + Arrays.toString(arr));
        executeSelectionSort(arr);
        System.out.println("Array After Execution Insertion Sort in non Increasing order : " + Arrays.toString(arr));
        System.out.println("Expected Result After execution Insertion Sort in non Increasing Order : "+ "[26, 31, 41, 41, 58, 59]" );

        // second test case
        System.out.println("Second test case :");
        int[] arr2 =new int[]{10,9,8,7,6,5,4,3,2,1,0};
        System.out.println("Array before Sorting " + Arrays.toString(arr2));
        executeSelectionSort(arr2);
        System.out.println("Array After Execution Insertion Sort in non Increasing order : " + Arrays.toString(arr2));
        System.out.println("Expected Result After execution Insertion Sort in non Increasing Order : "+ "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]" );
    }


    public static void executeSelectionSort(int[] arr ) {
        for (int i = 0 ; i < arr.length ; i++) {
            int smallestElementIndex = findSmallestElementIndex(arr,i);
            swapBetweenSmalestAndCurrent(arr, i, smallestElementIndex);
        }
    }

    private static void swapBetweenSmalestAndCurrent(int[] arr, int i, int smallestElementIndex) {
        int temp = arr[smallestElementIndex];
        arr[smallestElementIndex] = arr[i];
        arr[i] = temp ;
    }

    private static int findSmallestElementIndex(int[] arr , int start) {
        int smallestElementIndex = start ;
        for (int i = start +1; i <arr.length ; i++) {
            if (arr[i] < arr[smallestElementIndex]) {
                smallestElementIndex = i;
            }
        }
        return smallestElementIndex ;
    }


}
