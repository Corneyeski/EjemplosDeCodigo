package fixcodes;

import java.io.IOException;

public class FixCode11 {

    public static void main(String[] args) throws IOException {


        int option;
        option = 2 + 3;
        option++;

        switch (option){
            case 1:
                System.out.println("Message 1");
                break;
            case 2:
                System.out.println("Message 2");
                break;
            case 3:
                System.out.println("Message 3");
                break;
            case 4:
                System.out.println("Message 4");
                break;
            case 5:
                System.out.println("Message 5");
                break;
            default:
                System.out.println("Default message");
                break;
        }
        switch (option){
            case 6 -> System.out.println("Message 1");
            case 7 -> System.out.println("Message 2");
            case 8 -> System.out.println("Message 3");
            default -> System.out.println("Default message number 2");
        }
    }
}
