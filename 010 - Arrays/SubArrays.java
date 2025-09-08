public class SubArrays {
    public static void main(String args[]){
        int nums[] = {10, 20, 30, 40, 50};
        for(int i = 0; i<nums.length; ++i){
            for(int j = i; j<nums.length; ++j){
                System.out.print("[");
                for(int k = i; k<=j; ++k){
                    System.out.print(nums[k]);
                    if(k < j){
                        System.out.print(", ");
                    }
                }
                System.out.print("] ");
            }
            System.out.println();
        }
    }
}

// number of sub-arrays = n(n+1)/2
