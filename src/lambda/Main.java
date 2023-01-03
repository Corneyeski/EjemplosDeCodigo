package lambda;

import lambda.entities.Human;
import lambda.service.Messages;
import lambda.service.WeekDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Human human = new Human("Alan", 26);
        Human human2 = new Human("manolo", 30);

        List<Human> humans = new ArrayList<>(Arrays.asList(human, human2));

        List<Human> result = filterNoLambda(humans);
        List<Human> result2 = filterWithLambda(humans);


        /**
         * Example own interface with lambdas
         */

        //Define our implementation for the method
        Messages messages = name -> {
            System.out.println("Greetings " + name);
        };
        messages.greetings("Alan");

        //Lambda with return
        WeekDay week = (day) -> {
            switch (day) {
                case 1 -> {
                    return "Monday";
                }
                case 2 -> {
                    return "Tuesday";
                }
                case 3 -> {
                    return "Wednesday";
                }
                case 4 -> {
                    return "Thursday";
                }
                case 5 -> {
                    return "Friday";
                }
                case 6 -> {
                    return "Saturday";
                }
                case 7 -> {
                    return "Sunday";
                }
                default -> {
                    return "not found";
                }
            }
        };

        System.out.println(week.day(6));
        System.out.println(week.day(3));
        System.out.println(week.day(2));
        System.out.println(week.day(10));


        /**
         * foreach loop
         */
        printResults(humans);
        printOnlyTheName(humans);

    }

    /**
     * Filter without lambdas
     *
     * @param humans
     * @return
     */
    private static List<Human> filterNoLambda(List<Human> humans) {

        List<Human> results = new ArrayList<>();

        for (Human human : humans) {
            if (human.getAge() < 28)
                results.add(human);
        }
        return results;
    }

    /**
     * Filter using lambda
     *
     * @param humans
     * @return
     */
    private static List<Human> filterWithLambda(List<Human> humans) {
        return humans.parallelStream()
                .filter(human -> human.getAge() < 28)
                .toList();
    }

    /**
     * foreach loop print
     */
    private static void printResults(List<Human> humans) {
        humans.forEach(System.out::println);
    }

    /**
     * foreach loop
     */
    private static void printOnlyTheName(List<Human> humans) {
        humans.forEach(human -> {
            String name = human.getName();
            System.out.println(name);
        });
    }
}
