public class LargestElementInAnArray{
    public static void main(String[] args) {
        int array[] = {3, 3, 0, 99, -40};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<array.length; ++i){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}