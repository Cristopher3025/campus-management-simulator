package edu.una.datastructures.campus.model;

public class Brigade {

    private String name;

    public Brigade(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Brigade: " + name;
    }
}
