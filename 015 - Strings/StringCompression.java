public class StringCompression {
    public static void main(String args[]){
        String word = "aaabbccc";
        StringBuilder newWord = new StringBuilder("");

        for(int i = 0; i<word.length(); ++i){
            int count = 0;
            for(int j = i; j<word.length(); ++j){
                if(word.charAt(i) == word.charAt(j)){
                    ++count;
                    ++i;
                }
            }
            newWord.append(word.charAt(i));
            newWord.append(count);
        }
    System.out.println(newWord);
    }
}
