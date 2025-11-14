package SEE;

import CIE.Student;

// Derived class from Student to store SEE marks
public class External extends Student {
    public int[] seeMarks = new int[5];

    public External(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void setMarks(int[] marks) {
        for (int i = 0; i < 5; i++) {
            seeMarks[i] = marks[i];
        }
    }
}
