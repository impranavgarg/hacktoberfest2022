package problems;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n==rev(n))
            System.out.println("yes");
        else
            System.out.println("No");
    }

    static int rev(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return  helper(n,digits);

    }

    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return ((rem)*(int)(Math.pow(10,digits-1))) + helper(n/10,digits-1);
    }

}




