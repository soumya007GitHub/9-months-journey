
import java.lang.Math;
public class OptimalSubArrayAddsToK{
    public static int result(int nums[], int target){
        int prefixSum = 0;
        int max = 0;
        int start = 0;
        int end = 0;
        while(end<nums.length){
            prefixSum = prefixSum + nums[end];

            while(prefixSum > target && start <= end){
                prefixSum = prefixSum - nums[start];
                ++start;
            }

            if(prefixSum == target){
                int length = (end - start) + 1;
                max = Math.max(max, length);
            }

            ++end;
        }
            return max;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1, 1, 1};
        int target = 3;
        System.out.println(result(nums, target));
    }
}