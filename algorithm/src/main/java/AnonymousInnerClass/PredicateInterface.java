package AnonymousInnerClass;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
       PredicateInterface.showp();
    }
public static void showp(){
        //predicate Interface usage
        Predicate<String> isLongerThan5 = str-> str.length() > 5;
        var y= isLongerThan5.test("Nadia");
    System.out.println(y);
    //predicate combining

    Predicate<String> str1= str-> str.contains("a");
    Predicate<String> str2 = str-> str.contains("c");
    //and predicate function
   var str3=str1.and(str2).test("Nadia");
    System.out.println(str3);
   //or predicate function
    var str4=str1.or(str2).test("Nadia");
    System.out.println(str4);
    //negate the function
    Predicate<String> str5=str1.negate();     //negate() returns predicate
    var g= str5.test("Alesh");              //testing the negated fun for certain string
    System.out.println(g);

}
}
