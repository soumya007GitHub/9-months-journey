import java.util.*;
public class Chocola{
    public static void main(String args[]){
        Integer verticalCost[] = {2, 1, 3, 1, 4};
        // 4, 3, 2, 1, 1
        Integer horizontalCost[] = {4, 1, 2};
        // 4, 2, 1

        Arrays.sort(verticalCost, Collections.reverseOrder());
        Arrays.sort(horizontalCost, Collections.reverseOrder());

        int currentColumn = 0;
        int currentRow = 0;

        int columnCuts = 1;
        int rowCuts = 1;

        int cost = 0;

        while(currentColumn < verticalCost.length && currentRow < horizontalCost.length){
            if(verticalCost[currentColumn] <= horizontalCost[currentRow]){
                cost = cost + (horizontalCost[currentRow]*columnCuts);
                ++rowCuts;
                ++currentRow;
            }else{
                cost = cost + (verticalCost[currentColumn]*rowCuts);
                ++columnCuts;
                ++currentColumn;
            }
        }
        while (currentRow < horizontalCost.length){
            cost = cost + (horizontalCost[currentRow]*columnCuts);
            ++currentRow;
            ++rowCuts;
        }
        while(currentColumn < verticalCost.length){
            cost = cost + (verticalCost[currentColumn]*rowCuts);
            ++currentColumn;
            ++columnCuts;
        }
        System.out.println(cost);
    }
}