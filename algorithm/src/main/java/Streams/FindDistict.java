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
                new Movie("c", 39)
        );

   //find distinct titles for movies
           movies.stream()
                .map(movie -> movie.getTitle().toUpperCase())
                .distinct()
                .forEach(System.out::println);
//total likes
        int totalLikes= movies.stream()
                .map(Movie :: getLikes)
                .reduce(0,(a,b)->a+b);
        System.out.println("totalLike:"+ totalLikes);

// maximum no in likes
        movies.stream()
                .map(movie-> movie.getLikes() > 30)
                .forEach(System.out::println);

//find conditional movies with filter
         movies.stream()
                .filter(movie-> movie.getLikes() > 30)
                 .map(n->n.getLikes())
                .forEach(System.out::println);

         //usage of peek
        movies.stream()
                .filter(movie->movie.getLikes()>25)
                .peek(m->System.out.println("get titles : "+m.getTitle()))
                .map(movie->movie.getTitle())
                .peek(title->System.out.println("mapped : "+ title.concat(" : HEllO")))
                .forEach(System.out::println);



    }
}
