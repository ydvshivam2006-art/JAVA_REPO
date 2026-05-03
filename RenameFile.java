import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("newfile.txt");
        File newFile = new File("renamed_file.txt");
        
        if (oldFile.exists()) {
            boolean success = oldFile.renameTo(newFile);
            if (success) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Failed to rename the file.");
            }
        } else {
            System.out.println("Source file does not exist.");
        }
    }
}