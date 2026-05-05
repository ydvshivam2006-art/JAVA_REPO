import java.io.File;

public class DirectorySize {
    public static void main(String[] args) {
        File directory = new File(".");
        long length = getFolderSize(directory);
        System.out.println("Size: " + length + " bytes");
    }

    public static long getFolderSize(File folder) {
        long length = 0;
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    length += file.length();
                } else {
                    length += getFolderSize(file);
                }
            }
        }
        return length;
    }
}