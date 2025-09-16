import java.util.Scanner;

public class Introduction{
    public static void main(String args[]){
        char str1[] = {'S', 'o', 'u', 'm', 'y', 'a'};
        String name = new String("Tripathy");
        String middle = "Ranjan";
        System.out.println(str1);
        System.out.println(name);
        System.out.println(middle);

        Scanner obj = new Scanner(System.in);
        String word = obj.next();
        System.out.println("Next sentence");
        String sentence = obj.nextLine();
        System.out.println(word);
        System.out.println(sentence);
    }
}