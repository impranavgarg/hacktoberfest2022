package problems;

import java.util.Scanner;

public class Digitsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(digitsum(n));

    }
    static int digitsum(int n){
        if(n==0){
            return 0;
        }
        return  (n%10)+ digitsum(n/10);
    }
}
