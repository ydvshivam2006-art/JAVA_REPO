import java.util.*;

public class StringExample {
    public static void main(String[] args) {
        
        
        String original = "GeeksGeeks";
        String toInsert = "For";
        int index = 4;
        String insertedResult = original.substring(0, index + 1) + toInsert + original.substring(index + 1);
        System.out.println("Inserted String: " + insertedResult);

        
        String leadingZeros = "00000456";
        String cleanString = leadingZeros.replaceFirst("^0+(?!$)", "");
        System.out.println("After removing zeros: " + cleanString);

        
        String word1 = "Mango";
        String word2 = "Man";
        int comparison = word1.compareTo(word2);
        System.out.println("Lexicographical Comparison: " + comparison);

        
        String codePointStr = "VSCode";
        int code = codePointStr.codePointAt(2); // 'C'
        System.out.println("Unicode at index 2: " + code);
    }
}