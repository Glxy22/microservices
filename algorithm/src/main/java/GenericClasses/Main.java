package GenericClasses;

public class Main {
    public static void main(String[] args) {
  var numArray= new GenericList<Integer>();
  numArray.setItem(56);
  numArray.setItem(6);
  numArray.setItem(87);

        System.out.println(numArray.getItem(0));
        System.out.println(numArray.getItem(1));
        var stringArray=new GenericList<String>();
        stringArray.setItem("HELLO");
        stringArray.setItem("NADIA");
        System.out.println(stringArray.getItem(0)+" "+ stringArray.getItem(1));




    }
}
