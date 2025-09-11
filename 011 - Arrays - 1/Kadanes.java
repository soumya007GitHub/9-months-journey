import java.lang.Math;
public class Kadanes{
    public static void main(String args[]){
        int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i<array.length; ++i){
            cs = cs + array[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println(ms);
    }
}

// Kadanes Algo - Max SubArray Value
// Time Complexity - O(n)