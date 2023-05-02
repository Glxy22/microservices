package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums= new int[]{1,7,3,4};
        for(int x:nums) {
//            Arrays.asList(nums);
            System.out.println(x);
        }
        Arrays.sort(nums);
        System.out.println(",,."+Arrays.toString(nums));
       System.out.println(nums);
        System.out.println("Hello world!");
    }
}