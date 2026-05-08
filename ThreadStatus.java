public class ThreadStatus {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        });
        System.out.println("Before start: " + thread.isAlive());
        thread.start();
        System.out.println("After start: " + thread.isAlive());
    }
}