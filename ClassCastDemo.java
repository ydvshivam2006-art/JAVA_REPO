public class ClassCastDemo {
    public static void main(String[] args) {
        
        Object movieTitle = "Inception";

        try {
            Integer number = (Integer) movieTitle;
            System.out.println("Value: " + number);
        } catch (ClassCastException e) {
            System.err.println("Error: " + e.getMessage());
            System.err.println("Cannot cast a String object to an Integer type.");
        }

        try {
            Object dynamicValue = Double.valueOf(45.67);
            Double decimalValue = (Double) dynamicValue;
            System.out.println("Successful cast value: " + decimalValue);
        } catch (ClassCastException e) {
            System.err.println("This will not execute because the cast is valid.");
        }
    }
}