public class AllPrimesInARange {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i<=Math.sqrt(n); ++i){
            if(n%i == 0){
                isPrime = false;
                break;
            }
            continue;
        }
        if(isPrime){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int range = 10;
        for(int i = 1; i<=range; ++i){
            System.out.println(i+" : "+isPrime(i));
        }
    }
}
