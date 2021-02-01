package ua.goit.module7.homework;

abstract class Shape implements Drawable, Eraseable {
    private String name;

    public String getName() {
        return name;
    }

    void printName() {
        System.out.println("Name of shape is " + getName() + ", from class: " + getClass().getSimpleName());
    }

    public void draw() {
        System.out.println("Draw " + getName());
    }

    public void erase() {
        System.out.println("Erase " + getName());
    }
}
