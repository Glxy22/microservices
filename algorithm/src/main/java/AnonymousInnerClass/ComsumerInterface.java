package AnonymousInnerClass;

import java.util.List;
import java.util.function.Consumer;

public class ComsumerInterface {
    public static void main(String[] args) {
        ComsumerInterface.show();
    }
    public static void show(){
        List<String> list= List.of("Nadia","sara","kinza");
        Consumer<String> print= item-> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
        for(var item: list) {
            list.forEach(print);
            //chaining consumer interface
            list.forEach(print.andThen(printUpperCase).andThen(print));
        }
        }
    }

