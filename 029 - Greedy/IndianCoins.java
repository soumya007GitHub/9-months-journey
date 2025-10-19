public class IndianCoins {
    public static void main(String[] args) {
        int coins[] = {2};
        int count = 0;
        int target = 3;
        int index = coins.length-1;
        // 0
        int current = coins[index];
        // 2
        while(target != 0 && index>=0){
            if(current <= target){
                ++count;
                target = target - current;
            }else{
                --index;
                if(index>=0){
                current = coins[index];
                }else{
                    break;
                }
            }
        }
        if(target == 0){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }
    }
}
