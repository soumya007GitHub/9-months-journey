import java.util.*;

public class LargestSmallest {

    public static int largestNumberFunc(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; ++i){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int smallestNumberFunc(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<numbers.length; ++i){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers[] = {56, 34, 89, 67, 88, 100, 43};
        int largestNumber = largestNumberFunc(numbers);
        int smallestNumber = smallestNumberFunc(numbers);
        System.out.println("Largest : "+largestNumber);
        System.out.println("Smallest : "+smallestNumber);
    }
}

// Time Complexity - O(n)
