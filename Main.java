// First Interface
interface Interface1 {
    void captureClick();   // click capture
}

// Second Interface
interface Interface2 {
    void captureVideo();   // video / second action capture
}

// Class implementing both interfaces
class MyApp implements Interface1, Interface2 {

    @Override
    public void captureClick() {
        System.out.println("Click captured (Capture 1)");
    }

    @Override
    public void captureVideo() {
        System.out.println("Video captured (Capture 2)");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        MyApp obj = new MyApp();

        // Calling both methods
        obj.captureClick();   // Capture 1
        obj.captureVideo();   // Capture 2
    }
}