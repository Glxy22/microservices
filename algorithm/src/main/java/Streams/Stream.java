package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        Stream.s1();

    }
    public static void s1(){
        //stream for list
        var list= List.of(5,6,7,3);
        list.stream().forEach(System.out::println);

        //stream for arrays Arrays.stream(array)
     int[] nums = new int[]{4,6,8,3,5};
     Arrays.stream(nums).forEach(System.out::println);   // pass the array inside the stream


        // 1-stream.generate()
        //2- Stream.iterate()
        //3- stream.flatMap()    Stream <List<list>> -> stream<list>   flates the nested stream elements

         //stream.flatMap(list->list.stream()).forEach(n->sout);


    //stream.generate() with limit
//        var stream= Stream.generate(()->Math.random());
//
//       stream
//            .limit(3)
//            .forEach(n-> System.out.println(n));
//
//
////or
//                Stream<Double> stream = Stream.generate(() -> Math.random());
//                stream.forEach(n -> System.out.println(n));
//
//                //stram.iterate()
//
//        Stream.iterate(1,n->n+1)
//                .limit(10);
//                .forEach(n-> System.out.println(n));

        }



}



