import java.util.Arrays;
import java.util.Collections;
import java.lang.Integer;

public class InBuiltSort{
    public static void main(String args[]){
        int array1[] = {5, 4, 3, 1, 2};
        Integer array2[] = {5, 4, 3, 1, 2};

        // For Sorting
        Arrays.sort(array1);

        // For Sorting and Reversing
        Arrays.sort(array2, Collections.reverseOrder());
        for(int i = 0; i<array1.length; ++i){
            System.out.println(array1[i]);
        }

        for(int i = 0; i<array2.length; ++i){
            System.out.println(array2[i]);
        }
    }
}