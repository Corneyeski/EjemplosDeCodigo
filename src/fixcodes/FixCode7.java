package fixcodes;

public class FixCode7 {
    public static void main(String[] args) {

        boolean check = false;

        if(10 / 2 == 5){
            message();
            check = !check;
        } else if (4 + 4 != 10) {
            messageTwo();
            check = !check;
        }
        System.out.println(check);
    }

    private static void message() {
        System.out.println("the result is: ");
    }
    private static void messageTwo() {
        System.out.println("variable equals: ");
    }
}
