import java.util.*;

public class Activity {
    public static void main(String args[]){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        // if end array unsorted then sorting is needed and we can create a 2D array to store new ordered elements like 
        // [[], [], [], []]
        int count = 1;
        ArrayList<Integer> activities = new ArrayList<>();
        activities.add(0);
        int lastactivity = end[0];
        for(int i = 1; i<end.length; ++i){
            if(start[i] >= lastactivity){
                activities.add(i);
                lastactivity = end[i];
                ++count;
            }
        }
        for(int i = 0; i<activities.size(); ++i){
            System.out.println(start[activities.get(i)]+", "+end[activities.get(i)]);
        }
    }
}
