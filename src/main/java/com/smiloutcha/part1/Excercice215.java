package com.smiloutcha.part1;

public class Excercice215 {

    public static void main(String[] args) {

        // first test case
        int[] nums1 = new int[] {1,1,1,1};
        int[] nums2 = new int[] {1,1,1,1} ;
        System.out.println("Values to Compute are : 1111 + 1111");
        System.out.println("Expected result is : 11110" );
        System.out.println("Computed Result is " + addBinary(nums1,nums2));

        // second test case
        int[] nums3 = new int[] {1,1};
        int[] nums4 = new int[] {1};
        System.out.println("Values to Compute are : 11 + 1");
        System.out.println("Expected result is : 100" );
        System.out.println("Computed Result is " + addBinary(nums3,nums4));

        // third test case
        int[] nums5 = new int[]{1,0,1,0};
        int[] nums6 = new int[]{1,0,1,1};
        System.out.println("Values to Compute are : 1010 + 1011");
        System.out.println("Expected result is : 10101" );
        System.out.println("Computed Result is " + addBinary(nums5,nums6));
    }




    public static String addBinary(int[] nums1, int[] nums2)  {
        StringBuilder sb = new StringBuilder();
        int i = nums1.length -1 ;
        int j = nums2.length -1 ;
        int carry = 0 ;
        while (i >= 0 || j >= 0) {
            int sum = carry ;
            if (i >= 0) {
                sum += nums1[i]  ;
            }
            if (j >= 0 ) {
                sum += nums2[j] ;
            }
            sb.append(sum%2);
            carry = sum / 2 ;
            i -- ;
            j -- ;
        }
        if(carry == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
