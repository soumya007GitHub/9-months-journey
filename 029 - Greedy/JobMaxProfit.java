import java.util.*;
public class JobMaxProfit {

    public static class Job{
        int id;
        int deadline;
        int profit;
        Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int array[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i<array.length; ++i){
            jobs.add(new Job(i, array[i][0], array[i][1]));
        }

        Collections.sort(jobs, (a, b)->b.profit-a.profit);

        ArrayList<Integer> answer = new ArrayList<>();

        int time = 0;

        for(int i = 0; i<jobs.size(); ++i){
            if(jobs.get(i).deadline > time){
                answer.add(jobs.get(i).id);
                ++time;
            }
        }

        for(int i = 0; i<answer.size(); ++i){
            System.out.println((char)('a'+answer.get(i)));
        }
    }
}