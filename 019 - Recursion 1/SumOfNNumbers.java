public class SumOfNNumbers {

    public static int addition(int n){
        if(n == 0){
            return 0;
        }
        return n += addition(n-1);
    }
    public static void main(String args[]){
        int num = 5;
        System.out.println(addition(num));
    }
}
