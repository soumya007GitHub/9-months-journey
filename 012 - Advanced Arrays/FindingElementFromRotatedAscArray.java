public class FindingElementFromRotatedAscArray {
    public static void main(String args[]){
        int array[] = {4,5,6,7,0,1,2};
        int target = 3;
        int start = 0;
        int end = array.length;
        int mid = (start + end)/2;
            if(target < array[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        while(start <= end){
            mid = (start + end)/2;
            if(target < array[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println(mid);
    }
}
