import java.util.*;
import java.lang.Math;
public class LargestSubArrayWithValueK{
    public static int result(int nums[], int target){
        int prefixSum = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; ++i){
            prefixSum = prefixSum + nums[i];
            if(prefixSum == target){
                max = Math.max(max, i+1);
                map.put(prefixSum, i);
            }
            else{
                int complement = prefixSum - target;
                if(map.containsKey(complement)){
                    int index = map.get(complement);
                    int tempLength = i - index;
                    max = Math.max(max, tempLength);
                }
                if(!map.containsKey(prefixSum)){
                map.put(prefixSum, i);
                }
            }
        }
            return max;
    }
    public static void main(String[] args) {
        int nums[] = {2, 3, 1, 0, 0};
        int target = 3;
        System.out.println(result(nums, target));
    }
}