public class ReplaceChar {
    public static void main(String[] args) {
        String str = "Geeks For Geeks";
        int index = 6;
        char ch = 'f';
        String newStr = str.substring(0, index) + ch + str.substring(index + 1);
        System.out.println("Original: " + str);
        System.out.println("Modified: " + newStr);
    }
}