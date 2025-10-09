import java.util.*;
public class ReverseString{

    public static String reverse(String name){
        StringBuilder temp = new StringBuilder();
        int index = 0;
        Stack<Character> s = new Stack<>(); 
        while(index < name.length()){
            s.push(name.charAt(index));
            ++index;
        }
        while(!s.isEmpty()){
            char ch = s.pop();
            temp.append(ch);
        }
        return temp.toString();
    }
    public static void main(String args[]){
        String name = "soumya";
        System.out.println(reverse(name));
    }
}