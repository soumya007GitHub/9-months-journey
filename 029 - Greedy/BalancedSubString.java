public class BalancedSubString{
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        int count = 0;
        int val = 0;
        // -1
        for(int i = 0; i<s.length(); ++i){
            if(s.charAt(i) == 'L'){
                ++val;
            }else{
                --val;
            }
            if(val == 0){
                ++count;
            }
        }
        System.out.println(count);
    }
}