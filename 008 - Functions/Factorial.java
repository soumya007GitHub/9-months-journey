public class Factorial {
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
            // Used recursion technique
        }
    }
    public static void main(String[] args){
        int n = 4;
        int factorialValue = factorial(n);
        System.out.println(factorialValue);
    }
}
