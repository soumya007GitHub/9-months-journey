public class DiagonalSum {
    public static void main(String args[]){
        int array[][] = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int primarySum = 0;
        int secondarySum = 0;
        for(int i = 0; i<array.length; ++i){
            primarySum += array[i][i];
        }
        for(int i = 0; i<array.length; ++i){
            if((i+(array.length-1-i)) == array.length-1){
            secondarySum += array[i][array.length-1-i];
            }
        }
        System.out.println(primarySum);
        System.out.println(secondarySum);
    }
}
