import java.util.*;

public class MaximumChainOfPairs {
    public static void main(String args[]){
        int array[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        Arrays.sort(array, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 1;
        int end = array[0][1];
        for(int i = 1; i<array.length; ++i){
            if(array[i][0] >= end){
                end= array[i][1];
                ++count;
            }
        }
        System.out.println(count);
    }
}
