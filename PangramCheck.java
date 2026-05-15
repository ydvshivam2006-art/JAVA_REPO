`public class PangramCheck {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean[] alphabetPresent = new boolean[26];
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z' && !alphabetPresent[c - 'a']) {
                alphabetPresent[c - 'a'] = true;
                count++;
            }
        }
        System.out.println("Is Pangram: " + (count == 26));
    }
}