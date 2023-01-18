package lambda;

import empresa.entities.Employee;
import lambda.entities.Human;
import lambda.service.Messages;
import lambda.service.WeekDay;

import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {

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


        Collection<String> lista = new ArrayList<>();
        lista.add("test");
        lista.remove("test");
        //lista.re(0);


        List<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
        lista2.add(4);
        lista2.add(4);
        lista2.add(4);
        lista2.add(4);
        lista2.add(4);
        lista2.add(4);

        for (Integer integer : lista2) {
            System.out.println(integer);
        }

        List<Employee> company = new ArrayList<>();

        Employee company1 = new Employee(0, "fsafasf", "asfafs", "asffsa", Employee.Rank.WORKER);

        System.out.println(company1);

        company.add(company1);

        System.out.println(company.get(0));

        company.get(0).setName("Alan");

        System.out.println(company1.getName());

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);




        Optional<Map.Entry<Integer, Integer>> entry =
                map.entrySet()
                        .stream()
                        .filter(x -> x.getValue().equals(1))
                        .findFirst();

        if(entry.isPresent()){
            System.out.println("EL valor es tal");
        } else System.out.println("No hay coincidencias");








        for (Map.Entry<Integer, Integer> e : map.entrySet()) {

        }

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
