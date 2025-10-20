public class lexicographicallySmallest {
    public static void main(String args[]){
        int n = 5;
        int k = 42;
        StringBuilder result = new StringBuilder("");
        while(n != 0){
            if(k <= 26){
                int ch = k - (n-1);
                char c = (char)('a' + ch-1);
                result.insert(0, c);
                k = k - ch;
                --n;
            }else{
                result.insert(0, 'z');
                k = k - 26;
                --n;
            }
        }
        System.out.println(result.toString());
    }
}
