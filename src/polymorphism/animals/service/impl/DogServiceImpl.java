package polymorphism.animals.service.impl;

import polymorphism.animals.entities.Animal;
import polymorphism.animals.entities.Dog;
import polymorphism.animals.service.AnimalsService;
import utils.Utils;

public class DogServiceImpl implements AnimalsService {

    @Override
    public Animal createAnimal() {
        String name = Utils.askString("Name of the dog");
        int age = Utils.askInt("Age of the dog");
        String pattern = Utils.askString("Pattern of the dog");
        String raze = Utils.askString("raze of the dog");

        return new Dog(name, age, pattern, raze);
    }

}
