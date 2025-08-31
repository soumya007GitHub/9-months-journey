import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i =1; i<11; ++i){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
