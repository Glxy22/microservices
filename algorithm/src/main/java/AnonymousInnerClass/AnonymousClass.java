package AnonymousInnerClass;

public class AnonymousClass {
    public static void main(String[] args) {
      var obj = new AnonymousClass();
//       obj.greet(new AnonymousInterface() {
//           @Override
//           public void printMessage(String msg) {

//           }
//      });
        //call by lambda and implement the interface function
        obj.show();
    }

    public static void show(){
//  greet((String msg)-> System.out.println(msg); Simplified it more below

        String str = "My greetin in lamda : ";
        greet(msg -> System.out.println( str+ msg));
    }
    public static void greet(AnonymousInterface msg){
        msg.printMessage("GREETINGS");

    }
}
