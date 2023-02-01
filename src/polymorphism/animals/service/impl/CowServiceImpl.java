package polymorphism.animals.service.impl;

import polymorphism.animals.entities.Animal;
import polymorphism.animals.entities.Cow;
import polymorphism.animals.service.AnimalsService;
import utils.Utils;

public class CowServiceImpl implements AnimalsService {

    @Override
    public Animal createAnimal() {
        String name = Utils.askString("Name of the cow");
        int age = Utils.askInt("Age of the cow");
        String pattern = Utils.askString("Pattern of the cow");
        String color = Utils.askString("color of the cow");

        return new Cow(name, age, pattern, color);
    }
}
