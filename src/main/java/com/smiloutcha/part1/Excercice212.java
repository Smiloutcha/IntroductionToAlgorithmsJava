package com.smiloutcha.part1;

import static java.lang.System.out;

public class Excercice212 {

    public static void main(String[] args) {
        int[] arr = new int[] {10,1,8,1,9,1};
        int sum = computeSum(arr);
        out.println("Expected Sum is :" + 30 );
        out.println("Computed Sum is :" + sum);
        // loop invariant
        // initialisation : Sum is 0 , in an array which is empty or null sum of its elements is 0.
        // Maintenance : After each iteration sum will hold the new value plus its old value.
        // termination : Sum will hold sum of all elements after processing the whole array.

    }

    public static int computeSum(int[] arr) {
         int sum = 0 ;
         for (int element : arr) {
             sum = sum + element ;
         }
         return sum ;
    }

}
