public class PrintNumsInIncreasing {

    public static void increment(int counter, int boundary){
        System.out.println(counter);
        counter += 1;
        if(counter > boundary){
            return;
        }else{
            increment(counter, boundary);
        }
    }
    public static void main(String args[]){
        int num = 5;
        increment(1, num);
    }
}
