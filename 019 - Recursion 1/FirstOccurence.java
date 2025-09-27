public class FirstOccurence {

    public static int firstOccurence(int array[], int index, int target){
        if(index < array.length){
        if(array[index] == target){
            return index;
        }
        else{
            return firstOccurence(array, index+1, target);
        }
    }
        return -1;
    }
    public static void main(String args[]){
        int array[] = {2, 6, 5, 8, 9, 5};
        System.out.println(firstOccurence(array, 0, 5));
    }
}
