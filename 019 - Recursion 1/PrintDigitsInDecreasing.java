public class PrintDigitsInDecreasing {

    public static void recursivePrint(int n){
        int num = n;
        System.out.println(num);
        if(num >= 2){
        recursivePrint(num-1);
        }
    }
    public static void main(String args[]){
        int num = 5;
        recursivePrint(num);
    }
}
