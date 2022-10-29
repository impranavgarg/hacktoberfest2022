package com.company;

import java.util.Scanner;

public class Evendigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();

        }

    }
    static  int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int even = digits(nums[i]);
            if (even%2==0){
                count++;
            }

        }

        return  count;
    }
    static  int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num=num/10;
        }
        return  count;
    }

}
