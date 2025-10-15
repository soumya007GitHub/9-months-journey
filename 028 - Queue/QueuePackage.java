import java.util.*;

public class QueuePackage {
    public static void main(String args[]){
        Queue<Integer> obj = new LinkedList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        System.out.println(obj.peek());
        obj.remove();
        System.out.println(obj.peek());
    }
}
