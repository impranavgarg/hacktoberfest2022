package com.company;

public class Typecasting  {
    public static void main(String[] args) {
        long n = 1237589757;
//        int x;
//        int count = 0;
        long x = 0;
        while (n>0){
            long r = n%10;
            x = x*10+r;


            n=n/10;
        }
        System.out.println(x);
    }
}
