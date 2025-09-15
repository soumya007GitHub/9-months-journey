public class StaircaseSearch {
    public static void main(String args[]){
        int array[][] = {
            {10, 12, 14, 16},
            {11, 13, 15, 17},
            {21, 22, 23, 24},
            {31, 32, 33, 34}
        };
        int target = 15;
        int startRow = 0;
        int startColumn = array[0].length-1;
        while(startRow <= array.length-1 && startColumn >= 0){
            if(array[startRow][startColumn] == target){
                System.out.println(startRow+", "+startColumn);
                break;
            }
            else if(array[startRow][startColumn] < target){
                ++startRow;
            }
            else{
                --startColumn;
            }
        }
    }
}
