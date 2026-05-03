import java.io.File;

public class MakeFileReadOnly {
    public static void main(String[] args) {
        File file = new File("renamed_file.txt");
        
        if (file.exists()) {
            boolean success = file.setReadOnly();
            if (success) {
                System.out.println("File is now read-only.");
            } else {
                System.out.println("Failed to set file as read-only.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}