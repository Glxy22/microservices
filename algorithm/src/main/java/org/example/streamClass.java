package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class streamClass {
    public static void main(String[] arg) {


        List<String> str = Arrays.asList("hello", "google", "world");

        Stream<String> stream = str.stream();
        List<Integer> nums = Arrays.asList(2, 3, 5, 6, 7, 4);
        Stream<Integer> numStr = nums.stream();


        //anyMatch on stream
        boolean istrue = numStr.anyMatch(c -> c == 4);
        System.out.println(istrue);

        //for Each can't tbe performed on single stream as it ahs been used earlier

        // numStr.forEach(c -> System.out.println(c));
        nums.stream().forEach(System.out::println);

        //size of list by stream count()
        System.out.println(nums.stream().count());
        System.out.println("\n");
        nums.stream().sorted().
                forEach(System.out::println);
        System.out.println("\n");

        //double the value by map
        nums.stream().map(n -> n * 2).forEach(System.out::println);
        System.out.println("\n");

        //filter the numbers in list when they are odd and the perform operations
           nums.stream().filter(n->n%2==1).sorted().forEach(System.out::println);

       // add the elements by stream.reduce()
          int x=  nums.stream().reduce(0,(a,b)->(a+b));
        System.out.println("sum is : "+ x);

    }
}