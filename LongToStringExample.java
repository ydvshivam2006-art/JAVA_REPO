public class LongToStringExample{

    
    public static void main(String args[])
    {

        
        Long varLong = 999999999999L;

        
        String str = varLong + " ";

        
        System.out.println("Converted type : "
                           + str.getClass().getName());

        
        System.out.println(str);
    }
}