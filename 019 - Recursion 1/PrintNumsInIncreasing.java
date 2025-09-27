public class PrintNumsInIncreasing {

    public static void increment(int counter){
        if(counter - 1 > 0){
        increment(counter - 1);
        }
        System.out.println(counter);
    }
    public static void main(String args[]){
        increment(5);
    }
}
