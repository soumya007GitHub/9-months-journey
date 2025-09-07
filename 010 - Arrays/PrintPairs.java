public class PrintPairs {

    public static void printPairs(int nums[]){
        for(int i = 0; i<nums.length; ++i){
            for(int j = i+1; j<nums.length; ++j){
                System.out.print("("+nums[i]+", "+nums[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int nums[] = {40, 20, 50, 60, 30};
        printPairs(nums);
    }
}

// number of pairs = n(n-1)/2
// Time Complexity = O(n^2)