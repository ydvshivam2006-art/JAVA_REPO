import java.io.File;

public class SearchFile {
    public static void main(String[] args) {
        File rootDir = new File(".");
        String targetName = "SearchFile.java";
        findFile(rootDir, targetName);
    }

    public static void findFile(File root, String targetName) {
        File[] files = root.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    findFile(file, targetName);
                } else if (file.getName().equalsIgnoreCase(targetName)) {
                    System.out.println("Found at: " + file.getAbsolutePath());
                }
            }
        }
    }
}