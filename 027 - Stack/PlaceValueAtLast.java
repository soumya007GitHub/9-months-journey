import java.util.*;

public class PlaceValueAtLast {
    public static void addNew(Stack<Integer> s, int num){
        if(s.empty()){
            s.push(num);
            return;
        }
        int temp = s.pop();
        addNew(s, num);
        s.push(temp);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        addNew(s, 4);

        while(!s.isEmpty()){
            int temp = s.pop();
            System.out.println(temp);
        }
    }
}
