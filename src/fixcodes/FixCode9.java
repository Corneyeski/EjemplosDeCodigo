package fixcodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FixCode9 {

    public static void main(String[] args) throws IOException {

        boolean check = true;
        int value = 10;

        do {

            if (value == 50){
                check = false;
            }else if(value % 2 == 0){
                System.out.println(value);
            }

            value++;

        }while(check);
    }

}
