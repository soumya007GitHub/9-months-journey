public class SortedArrayCheck {
    public static void main(String args[]){
        int array[] = {};
        boolean flag = true;
        for(int i = 1; i<array.length; ++i){
            if(array[i] >= array[i-1]){
                continue;
            }
            else{
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
