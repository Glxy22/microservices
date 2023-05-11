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
        boolean istrue= numStr.anyMatch(c->c==4);
        System.out.println(istrue);

        //for Each can' tbe performed on single stream as it ahs been used earlier

       // numStr.forEach(c -> System.out.println(c));
        nums.stream().forEach(System.out::println);




    }
}