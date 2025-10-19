import java.util.Arrays;

public class FractionalKnapsack{
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // boxTypes[0][0] - numberOfBoxes
        // boxTypes[0][1] - content in each Box
        // [[5, 10], [3, 9], [4, 7], [2, 5]]
        //  50 + 27 + 14 - 77+14 = 91

        // Sort the boxTypes based on their max content of each Box
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(a[1], b[1]));
        // [[2, 5], [4, 7], [3, 9], [5, 10]]

        int remainingSpace = truckSize;
        int totalSpace = 0;
        for(int i = boxTypes.length-1; i>=0; --i){
            if(remainingSpace <= boxTypes[i][0]){
                totalSpace = totalSpace + (remainingSpace * boxTypes[i][1]);
                remainingSpace = remainingSpace - remainingSpace;
                break;
            }else{
            totalSpace = totalSpace + (boxTypes[i][0] * boxTypes[i][1]);
            remainingSpace = remainingSpace - boxTypes[i][0];
            }
        }
        return totalSpace;
    }
}
