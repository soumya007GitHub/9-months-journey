import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        int even = 0;
    int odd = 0;
    Scanner obj = new Scanner(System.in);
    int n;
        for(int i = 0; i<10; ++i){
        n= obj.nextInt();
        if(n%2 == 0){
            even += n;
        }
        else{
            odd += n;
        }
    }
    System.out.println("Sum of even numbers : "+even);
    System.out.println("Sum of odd numbers : "+odd);
    }
}
