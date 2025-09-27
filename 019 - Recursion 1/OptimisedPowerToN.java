public class OptimisedPowerToN {

    public static int optimisedpowerupton(int base, int power){
            if(power == 0){
                return 1;
            }
        if(power % 2 == 0){
            return optimisedpowerupton(base, power/2) * optimisedpowerupton(base, power/2);
        }
            return base * optimisedpowerupton(base, power/2) * optimisedpowerupton(base, power/2);
    }
    public static void main(String args[]){
        int base = 2;
        int power = 5;
        System.out.println(optimisedpowerupton(base, power));
    }
}
