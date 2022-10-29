package com.company;

public class SearchInStrings {
    public static void main(String[] args) {
        String name  = " Pranav";
//        String[] arr = {"rahul", " Sameer", "pranav", "Paresh","Pranav"};
        char str = 'P';
        System.out.println(String(name,str));


    }
    static Boolean String(String name, char str){
        if (name.length() == 0){
            return  false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==str){
                return  true;
            }

        }

        return  false;
    }
}
