package ua.goit.module7.homework;

import java.util.Arrays;

public class Triangle extends Shape2D {
    private String name;
    private int[] side = new int[3];

    Triangle(String name, int[] side) {
        side = Arrays.copyOf(side, 3);
        this.name = name;
        this.side = side;
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
        return (side[0] + side[1] + side[2]);
    }

    private double countSquare() {
        int p = (side[0] + side[1] + side[2]) / 2;
        double s = Math.sqrt(p * (p - side[0]) * (p - side[1]) * (p - side[2]));
        return s;
    }
}

