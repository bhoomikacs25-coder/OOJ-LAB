import java.util.Scanner;

// Custom Exception
class WrongAge extends Exception {
    WrongAge(String msg) {
        super(msg);
    }
}

// Base class Father
class Father {
    int fatherAge;

    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative!");
        }
        fatherAge = age;
    }
}

// Derived class Son
class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge); // call Father constructor

        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age must be less than Father's age!");
        }

        this.sonAge = sonAge;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Father's age: ");
            int fAge = sc.nextInt();

            System.out.print("Enter Son's age: ");
            int sAge = sc.nextInt();

            Son s = new Son(fAge, sAge);

            System.out.println("\n--- Age Details ---");
            System.out.println("Father age: " + s.fatherAge);
            System.out.println("Son age: " + s.sonAge);

        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
