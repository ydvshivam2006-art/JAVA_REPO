public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread working...");
            }
        });
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main thread exiting");
    }
}