import java.lang.Math;
public class PrefixSum {
    public static void main(String[] args) {
        int Max = Integer.MIN_VALUE;
        int array[] = {2, 4, 6, 8, 10};
        int sum = 0;
        int prefixSum[]  = new int[array.length];
        
        // Storing values in prefixSum Array
        prefixSum[0] = array[0];
        for(int i = 1; i<prefixSum.length; ++i){
            prefixSum[i] = prefixSum[i-1]+array[i];
        }
        
        for(int i = 0; i<array.length; ++i){
            for(int j = i; j<array.length; ++j){
                sum = 0;
                sum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
                if(sum > Max){
                    Max = sum;
                }
            }
        }
            System.out.println("Max - "+Max);
    }
}