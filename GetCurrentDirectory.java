import java.nio.file.Paths;

public class GetCurrentDirectory {
    public static void main(String[] args) {
        String currentPath = Paths.get("")
                                  .toAbsolutePath()
                                  .toString();

        System.out.println("Current Working Directory:");
        System.out.println(currentPath);

        String userDir = System.getProperty("user.dir");
        System.out.println("\nVerified via System Property:");
        System.out.println(userDir);
    }
}