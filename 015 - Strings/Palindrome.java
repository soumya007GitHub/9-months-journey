public class Palindrome {
    public static void main(String args[]){
        String name = "madam";
        boolean flag = false;
        for(int i = 0; i<name.length(); ++i){
            if(name.charAt(i) == name.charAt(name.length()-i-1)){
                flag = true;
            }
            else{
                flag = false;
            }
        }
    System.out.println(flag);
    }
}
