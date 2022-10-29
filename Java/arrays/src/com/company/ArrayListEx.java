package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//
//        boolean a = list.contains(67);

//        System.out.println(list);
//        System.out.println(a);
        for (int i = 0; i <5 ; i++) {
            list.add(in.nextInt());

        }
        System.out.println(list);

        for (int i = 0; i <5 ; i++) {
            System.out.println(list.get(i));

        }


    }
}
