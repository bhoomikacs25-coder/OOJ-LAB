import CIE.*;
import SEE.*;
import java.util.Scanner;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        External[] students = new External[n];
        Internals[] internals = new Internals[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("USN: ");
            String usn = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Semester: ");
            int sem = sc.nextInt();

            // Create student and internal mark objects
            students[i] = new External(usn, name, sem);
            internals[i] = new Internals();

            // Input CIE marks
            System.out.println("Enter 5 internal (CIE) marks: ");
            int[] imarks = new int[5];
            for (int j = 0; j < 5; j++) {
                imarks[j] = sc.nextInt();
            }
            internals[i].setMarks(imarks);

            // Input SEE marks
            System.out.println("Enter 5 SEE marks: ");
            int[] smarks = new int[5];
            for (int j = 0; j < 5; j++) {
                smarks[j] = sc.nextInt();
            }
            students[i].setMarks(smarks);
        }

        // Display final marks
        System.out.println("\n--- Final Marks of Students ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent: " + students[i].name + " (" + students[i].usn + ")");
            System.out.println("Semester: " + students[i].sem);
            System.out.println("Course-wise Final Marks:");
            for (int j = 0; j < 5; j++) {
                double finalMark = internals[i].internalMarks[j] + (students[i].seeMarks[j] / 2.0);
                System.out.println("Subject " + (j + 1) + ": " + finalMark);
            }
        }

        sc.close();
    }
}
