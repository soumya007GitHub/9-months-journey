import java.lang.Integer;

public class SecondLargestElement{
    public static void main(String args[]){
        int array[] = {100, 200};
        int largest1 = array[0];
        int largest2 = Integer.MIN_VALUE;
        for(int i = 1; i<array.length; ++i){
            if(array[i] > largest1){
                largest2 = largest1;
                largest1 = array[i];
            }
            else if(array[i] < largest1 && array[i] > largest2){
                largest2 = array[i];
            }
            else{
                continue;
            }
        }
    System.out.println(largest2);
    }
}