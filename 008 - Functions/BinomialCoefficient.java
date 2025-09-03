public class BinomialCoefficient {
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
        int r = 2;
        int binomialCoefficient = factorial(n) / (factorial(r) * factorial(n-r));
        System.out.println("The Binomial Coefficient of " + n + " and " + r + " is: " + binomialCoefficient);
    }
}
