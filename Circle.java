package ua.goit.module7.homework;

public class Circle extends Shape2D {

    private String name;
    private int r;

    public void setName(String name) {
        this.name = name;
    }

    Circle(String name, int r) {
        this.name = name;
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public double getPerimeter() {
        return countPerimeter();
    }

    public double getSquare() {
        return countPerimeter();
    }

    private double countPerimeter() {
        return 2*Math.PI*r;
    }

    private double countSquare() {
        return Math.PI*r*r;
    }
}
