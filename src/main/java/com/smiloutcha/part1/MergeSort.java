package com.smiloutcha.part1;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr =new int[]{31,41,59,26,41,58};
        System.out.println("Array before Sorting " + Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println("Array After Execution Insertion Sort in non Increasing order : " + Arrays.toString(arr));
        System.out.println("Expected Result After execution Insertion Sort in non Increasing Order : "+ "[26, 31, 41, 41, 58, 59]" );
    }

    public static void mergeSort(int[] arr,int start , int end) {
        if (start < end) {
            int mid = start + (end-start)/2 ;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    public static void merge(int [] arr, int start , int mid, int end) {
        int leftArraySize = mid - start + 1 ;
        int rightArraySize = end - mid ;
        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];
        for (int i = 0 ; i< leftArraySize ; i++) {
            leftArray[i] = arr[start+i];
        }
        for (int i = 0 ; i < rightArraySize ; i++) {
            rightArray[i] = arr[mid+1+i];
        }
        int i =  0 ;
        int j = 0 ;
        int k = start ;
        while (i< leftArraySize && j < rightArraySize) {
            if(leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        while (i < leftArraySize) {
            arr[k++] = leftArray[i++] ;
        }

        while (j < rightArraySize) {
            arr[k++] = rightArray[j++] ;
        }


    }
}
