import java.lang.Math;
public class TrappedRainWater {
    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        
        int totalRainWater = 0;
        
        // For left auxiliary Array
        left[0] = arr[0];
        for(int i = 1; i<arr.length; ++i){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        
        // For right auziliary array
        right[arr.length - 1] = arr[arr.length-1];
        for(int i = arr.length - 2; i>=0; --i){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        
        for(int i = 0; i<arr.length; ++i){
            int min = Math.min(left[i], right[i]);
            int waterQuantity = min-arr[i];
            totalRainWater += waterQuantity;
        }
        System.out.println(totalRainWater);
    }
}


// Time Complexity - O(n)