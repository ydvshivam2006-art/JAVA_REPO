public class ThreadConsistencyError implements Runnable {
    private volatile int count = 0;

    public void run() {
        for (int i = 0; i < 5; i++) {
            count++;
        }
        System.out.println(Thread.currentThread().getName() + " Count: " + count);
    }

    public static void main(String[] args) {
        ThreadConsistencyError task = new ThreadConsistencyError();
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}