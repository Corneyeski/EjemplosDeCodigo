package fixcodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FixCode8 {

    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int val = 12;
        int val2 = 23;

        double ask = Integer.parseInt(buffer.readLine());

        System.out.println("Cuanto es 12 + 23?");

        if(ask == val + val2) {
            System.out.println("Es correcto!");
        }else {
            System.out.println("Te has equivocado");
        }
    }

}
