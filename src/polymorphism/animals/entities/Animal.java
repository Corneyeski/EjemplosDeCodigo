package polymorphism.animals.entities;

import polymorphism.entities.A;
import utils.Utils;

public class Animal {

    {
        this.sound = "silent";
    }
    private String name;
    private int age;
    private String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("this animal goes: " + sound);
    }

    public Animal createAnimal() {
        this.name = Utils.askString("Name of the animal");
        this.age = Utils.askInt("Age of the animal");

        return this;
    }
}
