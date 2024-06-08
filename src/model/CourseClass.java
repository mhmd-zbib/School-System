package model;

import java.util.List;

public class CourseClass {

    private final char building;
    private final int level;
    private final int number;
    private final String name;


    public CourseClass(int level, int number, char building) {
        if (level >= 10) throw new IllegalArgumentException("We dont have past level 9");
        if (number > 99) throw new IllegalArgumentException("We dont have past level 99");
        this.building = building;
        this.level = level;
        this.number = number;
        this.name = this.level + "" + (this.number >= 10 ? this.number : "0" + this.number) + this.building;

    }


    @Override
    public String toString() {
        return "name='" + name + '\'';
    }
}
