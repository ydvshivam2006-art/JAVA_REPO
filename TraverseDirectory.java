import java.io.File;

public class TraverseDirectory {
    public static void main(String[] args) {
        File directory = new File(".");
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName());
                }
            }
        }
    }
}