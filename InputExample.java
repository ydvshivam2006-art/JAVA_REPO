import java.util.Scanner;

class  InputExample{
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();
        System.out.println("You entered string " + s1);

        int a = s.nextInt();
        System.out.println("You entered integer " + a);

        float b = s.nextFloat();
        System.out.println("You entered float " + b);

        s.close();
    }
}