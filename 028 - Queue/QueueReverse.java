import java.util.*;

public class QueueReverse {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        Stack<Integer> s = new Stack<>();

        // Putting elements into stack from queue
        while(!q.isEmpty()){
            s.push(q.remove());
        }

        // putting elements from stack into queue in reverse order
        while(s.size() != 0){
            q.add(s.pop());
        }

        // Printing queue elements
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
