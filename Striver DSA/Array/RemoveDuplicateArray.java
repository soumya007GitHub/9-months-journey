public class RemoveDuplicateArray {
    public static void main(String args[]){
        int array[] = {0,0,1,1,1,2,2,3,3,4};
        int count = 1;
        for(int i = 1; i<array.length; ++i){
            if(array[i] == array[i-1]){
                continue;
            }
            else{
                array[count] = array[i];
                ++count;
            }
        }

        for(int i = 0; i<array.length; ++i){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println(count);
    }
}
