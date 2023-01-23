package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        example2();
        //example3();
    }

    private static void example1() {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);

        Optional<Map.Entry<Integer, Integer>> entry =
                map.entrySet()
                        .stream()
                        .filter(x -> x.getValue().equals(1))
                        .findFirst();

        if (entry.isPresent()) {
            System.out.println("EL valor es tal");
        } else System.out.println("No hay coincidencias");
    }

    private static void simpleExampleForeach() {
        //Orden natural (de menor a mayor)
        Map<Long, String> miMapa = new TreeMap<>();
        miMapa.put(1L, "Alan");
        miMapa.put(3L, "Alan");
        miMapa.put(41L, "Alan");
        miMapa.put(55L, "Alan");
        miMapa.put(11L, "Alan");
        miMapa.put(49L, "Alan");
        miMapa.put(33L, "Alan");
        miMapa.put(14L, "Alan");
        miMapa.put(15L, "Alan");
        miMapa.put(19L, "Alan");

        miMapa.forEach((key, value) -> {
            System.out.println("La key es: " + key);
            System.out.println("La value es: " + value);
        });

        //Orden aleatorio
        Map<Long, ClaseEjemplo> miMapa2 = new HashMap<>();
        miMapa2.put(1L, new ClaseEjemplo());
        miMapa2.put(3L, new ClaseEjemplo());
        miMapa2.put(41L, new ClaseEjemplo());
        miMapa2.put(55L, new ClaseEjemplo());
        miMapa2.put(11L, new ClaseEjemplo());
        miMapa2.put(49L, new ClaseEjemplo());
        miMapa2.put(33L, new ClaseEjemplo());
        miMapa2.put(14L, new ClaseEjemplo());
        miMapa2.put(15L, new ClaseEjemplo());
        miMapa2.put(19L, new ClaseEjemplo());


        miMapa2.forEach((key, value) -> {
            System.out.println("La key es: " + key);
            System.out.println("La value es: " + value);
        });
    }

    /**
     * Remove and collect from one list to another applying a filter
     */
    private static void example2() {

        System.out.println("Example 2");

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            map.put((int) (Math.random() * 1000 + 1), (int) (Math.random() * 1000 + 1));
        }

        Map<Integer, Integer> removeAndCollect = map.entrySet()
                .stream()
                .filter(e -> e.getKey() < 100 || e.getValue() < 100)
                .collect(Collectors.collectingAndThen(
                        Collectors.toMap(Map.Entry::getKey, Map.Entry::getKey),
                        l -> {
                            l.forEach((k, v) -> map.remove(k));
                            return l;
                        }
                ));

        Map<Integer, Integer> removeAndCollect2 = map.entrySet()
                .stream()
                .collect(
                        Collectors.filtering(
                                e -> e.getKey() < 100 || e.getValue() < 100,
                                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)
                        )
                );

        System.out.println("map");
        map.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println("remove and collect");
        removeAndCollect.forEach((k, v) -> System.out.println(k + " " + v));
    }

    /**
     * Remove and collect from one list to another applying a filter in two steps
     */
    private static void example3() {
        System.out.println("Example 3");

        Map<Integer, Integer> map = new HashMap<>();

        //Generate random values
        for (int i = 0; i < 100; i++) {
            map.put((int) (Math.random() * 1000 + 1), (int) (Math.random() * 1000 + 1));
        }

        Map<Integer, Integer> resultsFilter = map.entrySet().stream()
                .filter(e -> e.getKey() < 100 || e.getValue() < 100)
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue
                        ));

        map.entrySet().removeIf(e -> resultsFilter.containsKey(e.getKey()));

        System.out.println("Init map");
        map.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

        System.out.println("Filtered map");
        resultsFilter.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
