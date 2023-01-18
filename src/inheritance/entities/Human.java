package inheritance.entities;

import java.util.Date;

public class Human {

    private String name;
    private int age;
    private double weight;
    private double high;
    private Date birthday;

    public Human() {
    }

    public Human(String name, int age, double weight, double high, Date birthday) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.high = high;
        this.birthday = birthday;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void showProperties() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.birthday);
        System.out.println(this.high);
    }

    public void showClass() {
        System.out.println("Soy la clase Human");
    }
}
