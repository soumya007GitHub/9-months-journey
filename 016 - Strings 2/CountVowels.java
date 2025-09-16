import java.util.Scanner;
public class CountVowels {

    public static int countVowels(String sentence){
        int count = 0;
        for(int i =0; i<sentence.length(); ++i){
            if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u' || sentence.charAt(i) == 'A' || sentence.charAt(i) == 'E' || sentence.charAt(i) == 'I' || sentence.charAt(i) == 'O' || sentence.charAt(i) == 'U'){
                ++count;
            }
        }
        return count;
    }
    public static void main(String args[]){
        // a = 97, z = 122
        // A = 65, Z = 90
        System.out.println("Enter String : ");
        Scanner obj = new Scanner(System.in);
        String sentence = obj.nextLine();
        System.out.println(countVowels(sentence));
    }
}
