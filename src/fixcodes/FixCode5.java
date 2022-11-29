package fixcodes;

public class FixCode5 {

    public static void main(String[] args) {

        char letter = 'F';

        int value1 = 24;
        int value2 = 73;


        System.out.print("result: ");

        if(value1 > 24 && value2 == 73){
            System.out.print(value1 + value2);
        }else if(value2 != 10){
            System.out.print("not 10");
        }

        if(letter == 'F'){
            System.out.print(letter);
        }else {
            letter = 'A';
        }

        System.out.print(letter);

    }
}
