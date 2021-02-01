package ua.goit.module7.homework;

public class Quad extends Shape2D {
    private String name;
    private int a;

    Quad(String name, int a) {
        this.name = name;
        this.a = a;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getPerimeter() {
        return countPerimeter();
    }

    public double getSquare() {
        return countSquare();
    }

    private double countPerimeter() {
        return 4 * a;
    }

    private double countSquare() {
        return a * a;
    }
}

