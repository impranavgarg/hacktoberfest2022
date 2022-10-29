package problems;

import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fun(n);
    }

    static void fun(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
}
