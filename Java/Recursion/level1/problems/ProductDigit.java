package problems;

import java.util.Scanner;

public class ProductDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(prduct(n));

    }
    static int prduct(int n){
        if(n%10==n){
            return n;
        }
        return  (n%10)* prduct(n/10);
    }
}
