package AnonymousInnerClass;

public class MethodReference {

    MethodReference(String message){

    }
//    public static void print(String str){}

    public void Print(String str){}              //last exp with the instance method instead of static

    public static void show(){
         greet(message-> System.out.println(message));   //alt+enter(method reference) for exchange with lamda
        // ....option 1
//syntex :      class/object::method      ..... use method with out ()
 // rewrite above expression  //option ..2

        greet(System.out::println);

//        greet(message -> print(message));    //option 1... passing message to print method
//        greet(MethodReference::print);       //option 2.... with method referance

//       var demo = new MethodReference();      // when calling method which is not
                                                    // static...use without constructor
//        greet(demo::Print);

                                      //method reference in constructor
        greet(message->new MethodReference(message));
                greet(MethodReference::new);



    }
    public static void greet(AnonymousInterface msg){
        System.out.println("I am using method reference here");
    }
}
