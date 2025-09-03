public class BinaryToDecimal {
    public static int decimalNumber(int num){
        int power = 0;
        int result = 0;
        int lastDigit = 0;
        while(num != 0){
            lastDigit = num%10;
            result += (lastDigit*Math.pow(2, power));
            ++power;
            num = num/10;
        }
        return result;
    }
    public static void main(String args[]){
        int binaryNumber = 1011;
        int DecimalNumber = decimalNumber(binaryNumber);
        System.out.println(DecimalNumber);
    }
}
