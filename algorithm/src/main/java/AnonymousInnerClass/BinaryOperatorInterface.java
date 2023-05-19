package AnonymousInnerClass;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryOperatorInterface {
    public static void main(String[] args) {
BinaryOperatorInterface.show();
    }
    public static void show(){

        BinaryOperator<Integer> square= (a,b) -> a*b;
        BinaryOperator<String> str = (a,b)-> a.concat(b);
       //square
        var x= square.apply(2,4);
        System.out.println(x);

        //string concat
        var y= str.apply("Nadia"," Shahid");
        System.out.println(y);

        //combine binary and function interface
        Function<String, String> str2 = str1-> str1.toUpperCase();
      var combinedStr = str.andThen(str2).apply("Nadia", "Alesha");
        System.out.println(combinedStr);

        /////UnaryOPerator  takes one predicate

        UnaryOperator<Integer>  num= n-> (n+n)*n;
        UnaryOperator<Integer> convert= num2-> num2.compareTo(7);
        var result= num.andThen(convert).apply(2);
        System.out.println(result);

    }
}
