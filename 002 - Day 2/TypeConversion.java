public class TypeConversion {
    public static void main(String[] args) {
        // Implicit Conversion (Widening)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Conversion: " + doubleValue);

        // Explicit Conversion (Narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit Conversion: " + anotherIntValue);

        // String to Integer
        String strNumber = "123";
        int parsedInt = Integer.parseInt(strNumber);
        System.out.println("String to Integer: " + parsedInt);

        // Integer to String
        int number = 456;
        String strFromInt = Integer.toString(number);
        System.out.println("Integer to String: " + strFromInt);
    }
}