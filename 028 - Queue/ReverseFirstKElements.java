import java.util.*;

public class ReverseFirstKElements {

    public static void reverse(Queue<Integer> q, int k){
        Stack<Integer> stack = new Stack<>();
        int leftElements = q.size() - k;
        for(int i = 1; i<=k; ++i){
            stack.push(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        while(leftElements >= 1){
            int temp = q.remove();
            q.add(temp);
            --leftElements;
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        int k = 5;
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        reverse(q, k);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
