package inheritance.entities;

import java.util.Date;

public class Police extends Human {

    private long id;
    private int experience;
    private String range;


    {
        id = 1L;
        experience = 0;
        range = "rookie";

        showProperties();
    }

    public Police() {
        super();
    }

    public Police(String name, int age, double weight, double high, Date birthday, long id, int experience, String range) {
        super(name, age, weight, high, birthday);
        this.id = id;
        this.experience = experience;
        this.range = range;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public void showProperties() {
        System.out.println(this.id);
        System.out.println(this.experience);
        System.out.println(this.range);
    }
}
