
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
class DoubleToString {
    
    public static void main(String[] args)
    {
        
        double number = 123.456;

        
        String method1 = String.valueOf(number);
        System.out.println("Using valueOf method "
                           + method1);

        
        String method2 = String.format("%f", number);
        System.out.println("Using format method "
                           + method2);

        
        String method3
            = new StringBuilder().append(number).toString();
        System.out.println("Using append method "
                           + method3);

        
        String method4 = Double.toString(number);
        System.out.println("Using toString method "
                           + method4);

    
        String method5
            = DecimalFormat.getNumberInstance().format(
                number);
        System.out.println("Using Decimalformat method "
                           + method5);
    }
}