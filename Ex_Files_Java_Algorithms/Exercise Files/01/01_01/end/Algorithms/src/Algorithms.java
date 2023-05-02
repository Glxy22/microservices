public class Algorithms {

    public static boolean isUppercase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowercase(String s) {
        // s.chars().noneMatch(Character::isUpperCase);
        return s.chars().allMatch(Character::isLowerCase);

    }
    public static boolean fun(String s){
        return s.chars().noneMatch(Character::isDigit);
    }
    public static void reverseTheWords(String s) {
        String[] s2 = s.split(",");
        StringBuilder rev;
        for (String s3 : s2) {
            System.out.println(s3);
           rev = new StringBuilder(s3);
           rev.reverse();
            System.out.println("reverse word is : " + rev);
        }
    }

    public static void main(String[] args) {

//        System.out.println(isUppercase("hello"));
//        System.out.println(isUppercase("HELLO"));
//
//        System.out.println(isLowercase("hello"));
//        System.out.println(isLowercase("HELLO"));
//        System.out.println(fun("HIKLOHJ"));
//        System.out.println(reverseTheWords(" world, great, working, won"));
        reverseTheWords(" world, great, working, won");
    }
}
