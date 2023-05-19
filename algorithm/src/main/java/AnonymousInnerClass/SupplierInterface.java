package AnonymousInnerClass;

import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
//        SupplierInterface.show();
        SupplierInterface.functionInterface();
    }
    //supplier interface
    public static void show(){
        Supplier<Double> getRandom= () -> Math.random();
        var randomnum = getRandom.get();
        System.out.println(randomnum);


    }
    //functional interface
    public static void functionInterface(){
        Function<String,Integer> map= item-> item.length();
        var length= map.apply("NADIA");
        System.out.println(" 3 kinds of functional interface :" + length);
    }
}
