package ua.goit.module7.homework;

import java.util.Arrays;

public class Rectangle extends Shape2D{
    private String name;
    private int[] side = new int[2];

    Rectangle (String name, int[] side) {
        side = Arrays.copyOf(side, 2);
        this.name = name;
        this.side = side;
    }

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
        return 2*(side[0] + side[1]);
    }

    private double countSquare() {
        return side[0] * side[1];
    }
}
