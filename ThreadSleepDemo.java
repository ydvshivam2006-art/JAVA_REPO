public class ThreadSleepDemo {
    public static void main(String[] args) {
        
        System.out.println("Starting countdown...");

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Time remaining: " + i);
                Thread.sleep(1000);
            }
            System.out.println("Blast off!");
        } catch (InterruptedException e) {
            System.err.println("The countdown thread was interrupted prematurely.");
            System.err.println("Details: " + e.getMessage());
        }
    }
}