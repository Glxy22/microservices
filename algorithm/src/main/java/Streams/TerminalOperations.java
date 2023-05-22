package Streams;

import java.util.Comparator;
import java.util.List;

public class TerminalOperations {
    public static void main(String[] args) {
        TerminalOperations.show();
    }

    public static void show() {
        List<Movie> movies = List.of(
                new Movie("B", 10),
                new Movie("A", 24),
                new Movie("C", 43),
                new Movie("c", 39)
        );
        //find any movie findAny()
        var x = movies.stream()
                .findAny().get();
        System.out.println(x.getLikes());

//findFirst()
        //anyMatch()
        var maxLikes = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get()
                .getLikes();
        System.out.println(maxLikes);

        //second approach
        var maxLikes2 = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println("max number in likes : "+ maxLikes2.getLikes());


        //find minimum
        var minLike= movies.stream()
                .min(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println("minimum number in likes : "+ minLike.getLikes());

        //reduce find max
       var max= movies.stream()
                .map(Movie::getLikes)
                .reduce(Integer::max).get();

        System.out.println("reducre max : "+max);


    }
}