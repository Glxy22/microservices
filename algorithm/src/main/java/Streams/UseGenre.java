package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UseGenre {
    public static void main(String[] args) {
        UseGenre.show();
    }
    public static void show() {

        List<Movie2> movies = List.of(
                new Movie2("B", 10,Genre.THRILLER),
                new Movie2("A", 24, Genre.ACTION),
                new Movie2("C", 43,Genre.ACTION),
                new Movie2("c", 39,Genre.COMEDY)
        );
//counting number of movies grouping them by genre
        var result= movies.stream()
                .collect(Collectors.groupingBy(
                        Movie2::getGenre,Collectors.counting()));
        System.out.println(result);


        //Grouping number of movies
        var result2= movies.stream()
                .collect(Collectors.groupingBy(
                        Movie2::getGenre,
                        Collectors.mapping(Movie2::getTitle,
                                Collectors.joining(", "))));

        System.out.println(result2);

        //grouping and partioning moives ->

        var result3= movies.stream()
                .collect(Collectors.partitioningBy(
                        m->m.getLikes() >25, Collectors.mapping(Movie2::getTitle, Collectors.joining(", "))));
        System.out.println(" Result 3 : "+ result3);


        //primitive stream generation
        IntStream.of(1,2,4);
        IntStream.range(1,9).forEach(System.out::println);  //in range() upper bound in not included-> 9 in not included
        IntStream.rangeClosed(1,9).forEach(System.out::println);//upper bound included


    }
}
