import java.lang.Integer;
public class LargestSmallestElements {
    public static int maxsearch(int[] array){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<array.length; ++i){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
        return max;
    }
    public static void main(String[] args) {
        int array[] = {10, 9, 15, 3, 7};
        System.out.println(maxsearch(array));
    }
}