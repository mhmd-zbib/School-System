package model;

public class Lecture {


    private String iD;
    private String name;
    private String description;


    public Lecture(String iD, String name, String description) {
        this.iD = iD;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
}
