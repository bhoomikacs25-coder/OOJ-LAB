class CollegeThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // 10 seconds
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class BranchThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("CSE");
                Thread.sleep(2000); // 2 seconds
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class MainThreads {
    public static void main(String[] args) {
        CollegeThread t1 = new CollegeThread();
        BranchThread t2 = new BranchThread();

        t1.start();
        t2.start();
    }
}
