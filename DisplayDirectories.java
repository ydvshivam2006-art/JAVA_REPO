import java.io.File;

public class DisplayDirectories {
    public static void main(String[] args) {
        File directory = new File(".");
        File[] subDirs = directory.listFiles(File::isDirectory);
        
        if (subDirs != null) {
            for (File dir : subDirs) {
                System.out.println("Directory: " + dir.getName());
            }
        }
    }
}