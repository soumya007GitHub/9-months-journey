public class DistinctElements{

    public static boolean func(int array[]){
        for(int i = 0; i<array.length; ++i){
            for(int j = i+1; j<array.length; ++j){
                if(array[j] == array[i]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int array1[] = {1, 2, 3, 4};
        int array2[] = {1, 2, 3, 1};
        int array3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result1 = func(array1);
        boolean result2 = func(array2);
        boolean result3 = func(array3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}