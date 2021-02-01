package ua.goit.module7.homework;

public class TestShape {


    public static void main(String[] args) {
        Shape2D c1 = new Circle("Circle1", 5);
        c1.printName();
        c1.draw();
        c1.erase();
        System.out.println("Perimeter = " + c1.getPerimeter());
        System.out.println("Square = " + c1.getSquare());
        System.out.println();

        Shape2D q1 = new Quad("Quad1", 2);
        q1.printName();
        q1.draw();
        q1.erase();
        System.out.println("Perimeter = " + q1.getPerimeter());
        System.out.println("Square = " + q1.getSquare());
        System.out.println();

        int[] sidesRectangle = {5,4};
        Shape2D r1 = new Rectangle("Rectangle1", sidesRectangle);
        r1.printName();
        r1.draw();
        r1.erase();
        System.out.println("Perimeter = " + r1.getPerimeter());
        System.out.println("Square = " + r1.getSquare());
        sidesRectangle[0] = 1;
        System.out.println("Perimeter = " + r1.getPerimeter());
        System.out.println();

        int[] sidesTriangle = {5,4,3};
        Shape2D t1 = new Triangle("Rectangle1", sidesTriangle);
        t1.printName();
        t1.draw();
        t1.erase();
        System.out.println("Perimeter = " + t1.getPerimeter());
        System.out.println("Square = " + t1.getSquare());
        sidesTriangle[0] = 1;
        System.out.println("Perimeter = " + t1.getPerimeter());
        System.out.println();

        Shape3D cube1 = new Cube("Cube1", 8);
        cube1.printName();
        cube1.draw();
        cube1.erase();
        System.out.println("Volume = " + cube1.getVolume());
        System.out.println("SquareOfSurface = " + cube1.getSquareOfSurface());
        System.out.println();

        Shape line1 = new Line("Line1");
        line1.printName();
        line1.draw();
        line1.erase();
        System.out.println();

        Shape3D cylinder1 = new Cylinder("Cylinder1", 8, 6);
        cylinder1.printName();
        cylinder1.draw();
        cylinder1.erase();
        System.out.println("Volume = " + cylinder1.getVolume());
        System.out.println("SquareOfSurface = " + cylinder1.getSquareOfSurface());
        System.out.println();

        PrintShapeName print = new PrintShapeName();
        print.printShapeName(c1);
        print.printShapeName(r1);
        print.printShapeName(t1);
        print.printShapeName(q1);
        print.printShapeName(cube1);
        print.printShapeName(line1);
        print.printShapeName(cylinder1);
    }
}
