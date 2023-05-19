package AnonymousInnerClass;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        SupplierInterface.show();
    }
    public static void show(){
        Supplier<Double> getRandom= () -> Math.random();
        var randomnum = getRandom.get();
        System.out.println(randomnum);


    }
}
