import java.lang.Integer;
public class MaxSubArray{
    public static void main(String args[]){
        int array[] = {1, -2, 6, -1, 3};
        int min = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<array.length; ++i){
            for(int j = i; j<array.length; ++j){
                sum = 0;
                for(int k = i; k<=j; ++k){
                    sum += array[k];
                }
                if(sum > min){
                    min = sum;
                }
            }
        }
        System.out.println("Max Sum="+min);
    }
}

// Time Complexity - O(n^3)