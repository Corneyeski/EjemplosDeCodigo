package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {


    public static void main(String[] args) {

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
        miMapa2.put(55L,  new ClaseEjemplo());
        miMapa2.put(11L,  new ClaseEjemplo());
        miMapa2.put(49L, new ClaseEjemplo());
        miMapa2.put(33L, new ClaseEjemplo());
        miMapa2.put(14L,  new ClaseEjemplo());
        miMapa2.put(15L, new ClaseEjemplo());
        miMapa2.put(19L,  new ClaseEjemplo());


        miMapa2.forEach((key, value) -> {
            System.out.println("La key es: " + key);
            System.out.println("La value es: " + value);
        });
    }
}
