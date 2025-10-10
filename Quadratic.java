import java.util.Scanner;

public class Quadratic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coefficient of a:");
        double a = sc.nextDouble();

        System.out.println("Enter coefficient of b:");
        double b = sc.nextDouble();

        System.out.println("Enter coefficient of c:");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are real and distinct.");
            System.out.println("Root1 = " + r1);
            System.out.println("Root2 = " + r2);
        } 
        else if (d == 0) {
            double r1 = -b / (2 * a);
            System.out.println("The roots are real and equal.");
            System.out.println("Root1 = Root2 = " + r1);
        } 
        else {
            double realPart = -b / (2 * a);
            double imgPart = Math.sqrt(-d) / (2 * a);
            System.out.println("The roots are complex and imaginary.");
            System.out.println("Root1 = " + realPart + " + " + imgPart + "i");
            System.out.println("Root2 = " + realPart + " - " + imgPart + "i");
        }

        sc.close();
    }
}

