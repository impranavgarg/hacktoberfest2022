package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = { 23,5 ,4, 19 , 52 ,78 };
        int target = 19;
        System.out.println(linearSearch(nums,target));
    }
    // search in the array
    static  int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return  - 1;
        }
        // run a loop
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]== target){
                return  i;

            }

        }
        return -1;
    }
}
