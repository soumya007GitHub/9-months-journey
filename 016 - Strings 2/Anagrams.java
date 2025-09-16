import java.util.Arrays;
public class Anagrams{
    public static void main(String args[]){
        boolean flag = false;
        String word1 = "Earth";
        String word2 = "Heart";
        if(word1.length() == word2.length()){
            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();
            char word1Array[] = word1.toCharArray();
            char word2Array[] = word2.toCharArray();
            Arrays.sort(word1Array);
            Arrays.sort(word2Array);
            if(Arrays.equals(word1Array, word2Array)){
                flag = true;
                System.out.println("Are they anagrams : "+flag);
            }
            else{
                flag = false;
                System.out.println("Are they anagrams : "+flag);
            }
        }
        else{
            System.out.println("Are they anagrams : "+flag);
        }
    }
}