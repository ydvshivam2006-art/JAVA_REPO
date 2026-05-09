public class AddBinary {
    public static void main(String[] args) {
        String b1 = "1010", b2 = "1101";
        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);
        System.out.println(Integer.toBinaryString(n1 + n2));
    }
}