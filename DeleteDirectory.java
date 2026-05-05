import java.io.File;

public class DeleteDirectory {
    public static void main(String[] args) {
        File directory = new File("test_directory");
        boolean deleted = deleteDir(directory);
        System.out.println("Directory deleted: " + deleted);
    }

    public static boolean deleteDir(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteDir(f);
                } else {
                    f.delete();
                }
            }
        }
        return dir.delete();
    }
}