package com.company;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {4,5,6},
                {5,8,9,6,3}
        };
        int target = 65;
        System.out.println(Search(arr, target));
    }

    static boolean Search(int[][] arr, int target) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if (arr[i][j] == target){
                    return true;
                }
                
            }

        }
        return  false;
    }
}
