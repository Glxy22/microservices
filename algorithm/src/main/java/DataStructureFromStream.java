import Streams.Movie;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DataStructureFromStream {
    public static void main(String[] args) {
        DataStructureFromStream.show();
    }

    public static void show() {

        List<Movie> movies = List.of(
                new Movie("B", 10),
                new Movie("A", 24),
                new Movie("C", 43),
                new Movie("c", 39)
        );

        //conver stream into list(again) and iterate over it
        var list = movies.stream().toList();
        System.out.println(list + "..... " + list.get(1).getTitle() + "....." + list.get(1).getLikes());
        for (var x : list) {
            System.out.println(x.getTitle() + "....." + x.getLikes());
        }

//List -> SET
       var set= movies.stream()
                .filter(m->m.getLikes()>25)
                .collect(Collectors.toSet());
        System.out.println(set.add(new Movie("Mine",32)));
//List-> MAP
        var map= movies.stream()
                .filter(m->m.getLikes()>25)
                .collect(Collectors.toMap(m->m.getTitle(), Function.identity()));  //Function.identity or m->m for returning movie obeject
        System.out.println(map);

      //get total likes
        var result= movies.stream()
                .filter(m->m.getLikes()>25)
                .collect(Collectors.summingInt(m->m.getLikes()));  //Function.identity or m->m for returning movie obeject
        System.out.println(result);

        //get all details

        var detail= movies.stream()
                .filter(m->m.getLikes()>25)
                .collect(Collectors.summarizingInt(m->m.getLikes()));  //Function.identity or m->m for returning movie obeject
        System.out.println("Details : "+detail);

        //concatinate all the titles

        var stringConcat= movies.stream()
                .filter(m->m.getLikes()>25)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));  //Function.identity or m->m for returning movie obeject
        System.out.println(stringConcat);
    }
}
