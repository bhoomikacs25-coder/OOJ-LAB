package CIE;

// Class to store internal (CIE) marks
public class Internals {
    public int[] internalMarks = new int[5];

    public void setMarks(int[] marks) {
        for (int i = 0; i < 5; i++) {
            internalMarks[i] = marks[i];
        }
    }
}
