package AnonymousInnerClass;

public class AnonymousClass {
    public static void main(String[] args) {
       var obj = new AnonymousClass();
       obj.greet(new AnonymousInterface() {
           @Override
           public void printMessage(String msg) {

           }
       });
    }
    public void greet(AnonymousInterface msg){
        System.out.println("GREETINGS");
    }
}
