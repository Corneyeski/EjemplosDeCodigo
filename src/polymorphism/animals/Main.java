package polymorphism.animals;

import polymorphism.animals.entities.Animal;
import polymorphism.animals.service.AnimalsService;
import polymorphism.animals.service.impl.CowServiceImpl;
import polymorphism.animals.service.impl.DogServiceImpl;

public class Main {

    private static final AnimalsService dogService = new DogServiceImpl();
    private static final AnimalsService cowService = new CowServiceImpl();

    public static void main(String[] args) {
        Animal animal = new Animal().createAnimal();
        Animal cow = dogService.createAnimal();
        Animal dog = cowService.createAnimal();

        animal.makeSound();
        dog.makeSound();
        cow.makeSound();
    }

}
