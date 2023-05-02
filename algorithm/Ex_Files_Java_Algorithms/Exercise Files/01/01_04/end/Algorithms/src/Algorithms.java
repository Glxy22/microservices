public class Algorithms {

    public static void parseContents(String s) {
        System.out.println("Option 1");
        String s2="";

        for (char c : s.toCharArray()) {
            //printing chars
            System.out.print("ll: "+c+" ");
            //getting required char in string
            if(c =='L'){
                s2 += c;

                System.out.println("stirng new : "+s2);
            }
        }

        System.out.println();
        System.out.println("Option 2");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(s.contains("LL"));

        parseContents(s);
    }
}
