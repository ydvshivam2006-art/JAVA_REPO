import java.io.File;

public class CreateDirectories {
    public static void main(String[] args) {
        File dir = new File("parent_dir/child_dir/sub_dir");
        boolean created = dir.mkdirs();
        System.out.println("Directories created: " + created);
    }
}