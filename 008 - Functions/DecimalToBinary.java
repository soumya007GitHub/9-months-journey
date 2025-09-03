public class DecimalToBinary {
    public static int binary(int n) {
        int result = 0;
        int place = 1;

        while (n > 0) {
            int remainder = n % 2;
            result = remainder * place + result;
            place *= 10;
            n = n / 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 12;
        int result = binary(n);
        System.out.println(result);
    }
}
