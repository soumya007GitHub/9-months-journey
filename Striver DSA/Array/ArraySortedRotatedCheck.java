public class ArraySortedRotatedCheck {
    public static void main(String args[]){
        int count = 0;
        int nums[] = {3, 4, 5, 1, 2};
        boolean flag = false;
        for(int i = 1; i<nums.length; ++i){
            if(nums[i] >= nums[i-1]){
                continue;
            }
            else{
                ++count;
            }
        }
        if(nums[0] >= nums[nums.length-1] && count == 1){
            flag = true;
        }
        else if(nums[0] <= nums[nums.length-1] && count == 0){
            flag = true;
        }
        else{
            flag = false;
        }
        System.out.println(flag);
    }
}
