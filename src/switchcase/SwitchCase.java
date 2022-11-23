package switchcase;

public class SwitchCase {

    public static void main(String... args){

        int opcion = 3;

        switch (opcion) {
            case 1 -> System.out.println("texto 1");
            case 2 -> {
                System.out.println("texto 2");
                System.out.println("texto 2");
            }
            case 3 -> System.out.println("texto 3");
            case 4 -> System.out.println("texto 4");
        }

        switch (opcion) {
            case 1:
                System.out.println("texto 1");
                break;
            case 2:
                System.out.println("texto 2");
                System.out.println("texto 2");
                System.out.println("texto 2");
                System.out.println("texto 2");
                break;
            case 3:
                System.out.println("texto 3");
                break;
            case 4:
                System.out.println("texto 4");

                break;
        }
    }

}
