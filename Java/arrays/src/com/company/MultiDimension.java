package com.company;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int col = 0; col < arr[i].length; col++) {
                arr[i][col] = in.nextInt();

            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int col = 0; col < arr[i].length; col++) {
//                arr[i][col] = in.nextInt();
                System.out.print(arr[i][col]+ " ");

            }

        }
    }

}
