package AnonymousInnerClass;

import java.util.function.Function;

public class ComposingFunctions {
    public static void main(String[] arg) {
        ComposingFunctions.show2();
    }

    public static void show2() {
        Function<String, String> firstFunc = str -> str.replace("=", ":");
        Function<String, Integer> secondFunc = str -> str.length();
// declareative programing
        var x = firstFunc.andThen(secondFunc).apply("HEllo= I am here!");
        System.out.println(firstFunc.apply("hkjliKKA= lapidaa"));
        System.out.println(x);

        //same results with compose function
        //compose is oposite of andThen, so we used secondFunc first and firstFunc later to achieve same results
        var y = secondFunc.compose(firstFunc).apply("Nadia=Sana");
        System.out.println(y);
    }
}
