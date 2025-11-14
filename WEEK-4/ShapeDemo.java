import java.util.Scanner;

abstract class Shape {
    int x, y;
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int l, int w) {
        x = l;
        y = w;
    }
    void printArea() {
        System.out.println("Area of Rectangle = " + (x * y));
    }
}

class Triangle extends Shape {
    Triangle(int b, int h) {
        x = b;
        y = h;
    }
    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * x * y));
    }
}

class Circle extends Shape {
    Circle(int r) {
        x = r;
    }
    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * x * x));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int w = sc.nextInt();
        Shape s1 = new Rectangle(l, w);
        s1.printArea();

        System.out.print("Enter base of triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter height of triangle: ");
        int h = sc.nextInt();
        Shape s2 = new Triangle(b, h);
        s2.printArea();

        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        Shape s3 = new Circle(r);
        s3.printArea();

        sc.close();
    }
}