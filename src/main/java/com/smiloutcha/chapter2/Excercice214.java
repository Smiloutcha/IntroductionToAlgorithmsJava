package com.smiloutcha.chapter2;

public class Excercice214 {

    public static void main(String[] args) {
        int[] arr = new int[]{5,9,1,5,6,3,12,15,5,8,88};
        Integer foundElementIndex = linearSearch(arr,9);
        System.out.println("Element index is " + foundElementIndex);
        System.out.println("Expected index is "+ 1);
    }


    public static Integer linearSearch(int[] arr , int x) {
        for (int i = 0 ; i< arr.length  ; i++) {
            if(arr[i] == x) {
                return i ;
            }
        }
        return null;
    }

}
