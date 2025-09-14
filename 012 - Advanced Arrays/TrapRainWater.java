import java.lang.Math;

public class TrapRainWater {

    public static int func(int array[]){
        int leftBoundary[] = new int[array.length];
        int rightBoundary[] = new int[array.length];
        int totalWater = 0;
        int totalHeight = 0;

        // For Left Boundary
        leftBoundary[0] = array[0];
        for(int i = 1; i<array.length; ++i){
            if(array[i] < leftBoundary[i-1]){
                leftBoundary[i] = leftBoundary[i-1];
            } 
            else{
                leftBoundary[i] = array[i];
            }
        }
    
        // For Right Boundary
        rightBoundary[array.length-1] = array[array.length-1];
        for(int i = array.length-2; i>=0; --i){
            if(array[i] > rightBoundary[i+1]){
                rightBoundary[i] = array[i];
            }
            else{
                rightBoundary[i] = rightBoundary[i+1];
            }
        }
    
        // Total Water in each bar
        for(int i = 0; i<array.length; ++i){
            totalHeight = Math.min(leftBoundary[i], rightBoundary[i]);
            totalWater = totalWater + (totalHeight-array[i]);
        }
        return totalWater;
    }
    public static void main(String args[]){
        int array1[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        int array2[] = {4, 2, 0, 3, 2, 5};
        System.out.println(func(array1));
        System.out.println(func(array2));
    }
}
