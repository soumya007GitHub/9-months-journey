public class LastOccurence {

    public static int lastIndex(int array[], int index, int target){
        if(index > 0){
        if(array[index] == target){
            return index;
        }
        else{
            return lastIndex(array, index-1, target);
        }
    }
        return -1;
    }

    public static void main(String args[]){
        int array[] = {2, 4, 2, 5, 5, 8, 4, 0};
        System.out.println(lastIndex(array, array.length-1, 5));
    }
}
