public class TipletsSum {
    public static void main(String args[]){
        // int array[] = {-1, 0, 1, 2, -1, 4};
        int array[] = {0};
        int sum = 0;
        for(int i = 0; i<array.length; ++i){
            for(int j = i+1; j<array.length; ++j){
                for(int k = j+1; k<array.length; ++k){
                    if(i != j && i != k && j != k){
                        sum = 0;
                        sum = array[i] + array[j] + array[k];
                        if(sum == 0){
                            System.out.println(array[i]+", "+array[j]+", "+array[k]);
                        }
                    }
                }
            }
        }
    }
}
