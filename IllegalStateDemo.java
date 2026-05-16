public class IllegalStateDemo {
    private boolean isConnected = false;

    public void connect() {
        isConnected = true;
        System.out.println("Database connection established.");
    }

    public void sendData(String data) {
        if (!isConnected) {
            throw new IllegalStateException("Cannot send data. Connection is not active.");
        }
        System.out.println("Data sent successfully: " + data);
    }

    public static void main(String[] args) {
        IllegalStateDemo app = new IllegalStateDemo();

        try {
            app.sendData("User Login Payload");
        } catch (IllegalStateException e) {
            System.err.println("State Error: " + e.getMessage());
        }

        try {
            System.out.println("\nFixing state...");
            app.connect();
            app.sendData("User Login Payload");
        } catch (IllegalStateException e) {
            System.err.println("This will not execute because the state is now valid.");
        }
    }
}