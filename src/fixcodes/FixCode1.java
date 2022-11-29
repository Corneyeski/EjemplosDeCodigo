package fixcodes;

public class FixCode1 {

    public static void main(String[] args) {

        int a = 0;
        int b = 12;
        int c = 32;

        a = sum(a, c);

        System.out.println(a - b);

    }
    private static  int sum(int value1, int value2){
        return value1 + value2;
    }

}
