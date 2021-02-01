package ua.goit.module7.homework;

public class Line extends Shape {
    private String name;

    public Line(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
