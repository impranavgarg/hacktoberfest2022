package com.company;

import java.util.ArrayList;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,16,8};
        System.out.println(search(arr,0, 5));
//        System.out.println(searchAll(arr,0, 5));
        searchAll(arr,0,5);
        System.out.println(list);
        System.out.println(searchAlllist(arr,0,5,new ArrayList<>()));

        ArrayList<Integer> ans = searchAlllist(arr,0,5,new ArrayList<>());
        System.out.println(ans);

        System.out.println(searchAlllist2(arr,0,5));

    }

    static int search(int[] arr, int index, int value) {
        if(index == arr.length){
            return  -1;
        }
        if(value==arr[index]){
            return  index;
        }
        return  search(arr,index+1,value);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAll(int[] arr, int index, int value) {
        if(index == arr.length){
            return  ;
        }
        if(value==arr[index]){
//            return  index;
            list.add(index);
        }

        searchAll(arr,index+1,value);
    }
    static ArrayList<Integer> searchAlllist(int[] arr, int index, int value, ArrayList<Integer> list) {
        if(index == arr.length){
            return list ;
        }
        if(value==arr[index]){
//            return  index;
            list.add(index);
        }

        return searchAlllist(arr,index+1,value, list);
    }
    static ArrayList<Integer> searchAlllist2(int[] arr, int index, int value) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list ;
        }
        if(value==arr[index]){
//            return  index;
            list.add(index);
        }
        ArrayList<Integer> ansBelow = searchAlllist2(arr,index+1,value);
//        return searchAlllist2(arr,index+1,value);
        list.addAll(ansBelow);
        return  list;
    }


}
