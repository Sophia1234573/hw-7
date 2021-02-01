package ua.goit.module7.homework;

public class Cylinder extends Shape3D {
    private String name;
    private int r;
    private int h;

    public Cylinder (String name, int r, int h) {
        this.name = name;
        this.r = r;
        this.h = h;
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
        return Math.PI * r * r * h;
    }

    private double countSquareOfSurface() {
        return 2 * Math.PI * r * r * h + 2*Math.PI * r;
    }
}
