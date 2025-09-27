public class SortedArrayCheck {

    public static boolean checkSort(int array[], int i) {
        if (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                return false;
            }
            return checkSort(array, i + 1);
        }
        return true;
    }


    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5 };
        System.out.print(checkSort(array, 0));
    }
}
