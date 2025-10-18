import java.util.*;

public class MinimumCostRope{
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 6, 9};
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int num: arr){
            q.add(num);
        }
        int result = 0;
        while(q.size()>=2){
            int first = q.remove();
            int second = q.remove();
            q.add(first+second);
            result += (first+second);
        }
        System.out.println(result);
    }
}