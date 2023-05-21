package Streams;

import java.util.List;

public class FindDistict {
    public static void main(String[] args) {
        FindDistict.show();
    }
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("B", 10),
                new Movie("A", 24),
                new Movie("C", 43),
                new Movie("c",39)
        );

        movies.stream()
                .map(movie-> movie.getTitle().toUpperCase())
                .distinct()
                .forEach(System.out::println);
    }
}
