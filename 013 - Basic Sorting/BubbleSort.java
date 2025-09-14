public class BubbleSort{
    public static void main(String args[]){
        int array[] = {5, 4, 1, 3, 2};

        // For Sorting Array
        for(int i = 0; i<array.length-2; ++i){
            for(int j = 0; j<=array.length - 2 -i; ++j){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    
        // For Printing Array
        for(int i = 0; i<array.length; ++i){
            System.out.println(array[i]);
        }
    }
}