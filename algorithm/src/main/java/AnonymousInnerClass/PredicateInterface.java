package AnonymousInnerClass;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
       PredicateInterface.showp();
    }
public static void showp(){
        Predicate<String> isLongerThan5 = str-> str.length() > 5;
        var y= isLongerThan5.test("Nadia");
    System.out.println(y);
}
}
