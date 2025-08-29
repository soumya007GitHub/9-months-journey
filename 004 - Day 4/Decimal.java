import java.util.Scanner;

public class Decimal{
    public static void main(String[] args){
        System.out.println("Enter number : ");
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        int resultNumber = 0;
        while(number != 0){
            int remainder = number%2;
            resultNumber = resultNumber*10 + remainder;
            number = number/2;
        }
        System.out.println("Binary : ");
        for(int i = resultNumber; i>0; i=i/10){
            int digit = i%10;
            System.out.print(digit);
        }
    }
}