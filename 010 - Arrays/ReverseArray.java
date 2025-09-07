public class ReverseArray {
    public static void reverseArray(int nums[]){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            ++start;
            --end;
        }
    }
    public static void main(String args[]){
        int nums[] = {20, 40, 10, 50, 70};
        reverseArray(nums);
        for(int i = 0; i<nums.length; ++i){
            System.out.println(nums[i]);
        }
    }
}
