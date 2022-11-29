package fixcodes;

public class FixCode2 {

    public static void main(String[] args) {

        int a = 0;
        int b = 12;
        int c = 32;

        a = div(c, a);

        System.out.println(a - b);

    }
    private static  int div(int value1, int value2){
        return value1 / value2;
    }

}
