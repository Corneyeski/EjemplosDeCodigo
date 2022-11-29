package fixcodes;

public class FixCode3 {

    public static void main(String[] args) {

        String a = "AB";
        String b = "C";
        String c = "BBA";

        System.out.println(a + c + b + concat(c, a));
    }

    private static String concat(String text, String text2){
        return text2 + text;
    }
}
