import java.util.*;
public class MinimumDifferenceOfPairsSum {
    public static void main(String args[]){
        int nums1[] = {1,10,4,4,2,7};
        int nums2[] = {9,3,5,1,7,4};
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int result = 0;
        for(int i = 0; i<nums1.length; ++i){
            result = result + Math.abs(nums1[i] - nums2[i]);
        }
        System.out.println(result);
    }
}
