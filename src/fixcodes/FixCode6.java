package fixcodes;

public class FixCode6 {
    public static void main(String[] args) {
        chooseOption(4);
        chooseOption(2);
        chooseOption(0);
    }

    private static void message(int number) {
        System.out.println(number);
    }

    private static void message2() {
        System.out.println(":");
    }

    private static void message3() {
        System.out.println("=");
    }

    private static void message4(int number) {
        System.out.println(number * 2);
    }

    private static void chooseOption(int option) {
        switch (option){
            case 1 -> message(option);
            case 2 -> message2();
            case 3 -> message3();
            case 4 -> message4(option);
            default -> System.out.println(option);
        }
    }
}
