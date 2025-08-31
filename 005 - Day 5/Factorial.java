import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        if(number == 0 || number == 1){
            System.out.println(1);
        }
        else if(number == 2){
            System.out.println(2);
        }
        else{
            int result = 1;
            for(int i =2; i<=number; ++i){
                result = result*i;
            }
            System.out.println(result);
        }
    }
}
