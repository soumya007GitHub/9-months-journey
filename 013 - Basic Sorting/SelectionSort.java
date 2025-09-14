import java.lang.Integer;

public class SelectionSort {
    public static void main(String args[]) {
        int array[] = { 5, 4, 1, 3, 2 };
        for (int i = 0; i < array.length-1; ++i) {
            int smallest = i;
            for (int j = i+1; j < array.length; ++j) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
    
        for(int i = 0; i<array.length; ++i){
            System.out.println(array[i]);
        }
    }
}