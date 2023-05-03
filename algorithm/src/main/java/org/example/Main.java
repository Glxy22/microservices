package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Main {

    public static OptionalInt findIteminArray(int[] num, int item){
        return Arrays.stream(num).filter(x-> x==item).findFirst();
    }
    public static void main(String[] args) {
        int [] nums= new int[]{1,7,3,4};

        //call method to find item in array
        OptionalInt optionalInt = findIteminArray(nums, 7);
        //convert optionalInt to int
        int value = optionalInt.orElse(0); // returns 10
        System.out.println("value of item found in array is : "+ value);

//        System.out.println("item searched in the array is : "+ c);


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
        List<String> s4 = Arrays.asList("hello","khjk","plpo");
        System.out.println("if string is uppercase : "+ s.chars().anyMatch(Character::isUpperCase));
        System.out.println("if string is lowercase : "+ s2.chars().anyMatch(Character::isLowerCase));
        System.out.println("if string has digit : "+ s3.chars().anyMatch(Character::isDigit));
        s4.stream().map(x->{
            System.out.println(x);
            return " +x" + x;

        });
    }
}