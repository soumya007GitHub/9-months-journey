import java.util.*;

public class DequeIntro{
    public static void main(String args[]){
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(10);
        d.addFirst(20);
        d.addLast(30);
        d.addLast(40);
        d.addLast(50);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        d.removeLast();
        System.out.println(d);
    }
}