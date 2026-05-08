public class JoinThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread 1 running");
            }
        });
        t1.start();
        t1.join();
        System.out.println("Main thread continues after t1 finishes");
    }
}