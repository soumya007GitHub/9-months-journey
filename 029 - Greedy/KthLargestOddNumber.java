import java.util.*;
public class KthLargestOddNumber{
    public static void main(String args[]){
        int l = 8;
        int r = 8;
        int k = 1;
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = l; i<=r; ++i){
            if(i%2 != 0){
                array.add(i);
            }
        }
        int index = array.size() - k;
        if(index < 0){
            System.out.println(0);
        }else{
            System.out.println(array.get(index));
        }
    }
}