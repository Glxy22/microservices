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
        String s="HELLO";
        String s2="hello";
        String s3="23576";
        System.out.println("if string is uppercase : "+ s.chars().anyMatch(Character::isUpperCase));
        System.out.println("if string is lowercase : "+ s2.chars().anyMatch(Character::isLowerCase));
        System.out.println("if string has digit : "+ s3.chars().anyMatch(Character::isDigit));
    }
}