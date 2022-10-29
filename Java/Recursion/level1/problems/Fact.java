package problems;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fact(n));
    }
    static  int  fact(int n){
        if(n<=1){
            return 1;
        }
        return  n*fact(n-1);

    }
}
