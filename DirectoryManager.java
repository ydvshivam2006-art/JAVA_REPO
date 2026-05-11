import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryManager {
    public static void main(String[] args) {
        String path = "sampleDir";
        traverseDir(new File(path));
        System.out.println("Size: " + getDirSize(new File(path)));
        createRecursiveDir("a/b/c");
        System.out.println("Current: " + System.getProperty("user.dir"));
    }

    public static void traverseDir(File dir) {
        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                System.out.println(file.getName());
            }
        }
    }

    public static long getDirSize(File dir) {
        long length = 0;
        for (File file : dir.listFiles()) {
            if (file.isFile()) length += file.length();
            else length += getDirSize(file);
        }
        return length;
    }

    public static void deleteDir(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) deleteDir(f);
        }
        dir.delete();
    }

    public static void createRecursiveDir(String path) {
        new File(path).mkdirs();
    }

    public static boolean searchFile(File dir, String name) {
        File[] list = dir.listFiles();
        if (list != null) {
            for (File f : list) {
                if (name.equalsIgnoreCase(f.getName())) return true;
            }
        }
        return false;
    }
}