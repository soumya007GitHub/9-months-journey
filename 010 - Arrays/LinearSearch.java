public class LinearSearch {

    public static int linearSearch(int array[], int key){
        for(int i = 0; i<array.length; ++i){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int marks[] = {10, 40, 20, 50, 45, 60};
        int key = 45;
        int result = linearSearch(marks, key);
        if(result > 0){
            System.out.println("Found at index : "+result);
        }
        else{
            System.out.println("Not Found");
        }
    }
}

// Linear Search - linearly searching an element from the array.
// Time Complexity - O(n) - for n(array length) times loop is running
