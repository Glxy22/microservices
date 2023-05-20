package Streams;

import java.util.Comparator;
import java.util.List;

public class StreamMap {



    public static void main(String[] args) {
        StreamMap.show();
    }
    public static void show() {
//        var list = List.of(5, 6, 7, 3);
//        list.stream().map(n-> n*n).forEach(System.out::println);

//find max in arraylist
        var list2= List.of(5,4,4,6,7,3);
       var x= list2.stream().reduce(Integer::max);
       x.ifPresent(System.out::println);

       //sorting and printing the titles of the movies
        List<Movie> movies= List.of(
                new Movie("B",10),
                new Movie("A",24),
                new Movie ("C", 43)
        );
 movies.stream()
         .sorted(Comparator.comparing(Movie::getTitle))
         .forEach(System.out::println);

         }
}
