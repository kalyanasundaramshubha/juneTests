import java.util.Arrays;

//package com.shubha.practice;

public class arraysorting {

    public static void main(String[]arguments){
        String names[]={"Meera","Keshav","Diya","Madhav","Aditi","Manu","Arjun","Anirudh"};
        String age[]={"5","9","6","4","7"};
        Arrays.sort(age);
        System.out.println("Get the least age: "+age[0]);
        Arrays.sort(names);
        for(int i=0;i<names.length;i++){
            System.out.println("Sorted order: "+names[i]);
        }
    }
}
