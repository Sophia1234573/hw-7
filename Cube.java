package ua.goit.module7.homework;

public class Cube extends Shape3D {
    private String name;
    private int a;

    public Cube(String name, int a) {
        this.name = name;
        this.a = a;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getVolume() {
        return countVolume();
    }

    public double getSquareOfSurface() {
        return countSquareOfSurface();
    }

    private double countVolume() {
        return a * a * a;
    }

    private double countSquareOfSurface() {
        return 6 * a * a;
    }
}
