public class Prime {
    public static void main(String[] args){
        int n = 12;
        boolean isPrime = true;
        for(int i = 2; i<=Math.sqrt(n); ++i){
            if(n%i == 0){
                isPrime = false;
                break;
            }
            continue;
        }
        if(isPrime){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
