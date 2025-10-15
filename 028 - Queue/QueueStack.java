import java.util.*;

public class QueueStack {

    public static class Queue{
        static Stack<Integer> left = new Stack<>();
        static Stack<Integer> right = new Stack<>();

        public static void add(int num){
            if(left.isEmpty()){
                left.push(num);
            }else{
                while(!left.isEmpty()){
                    right.push(left.pop());
                }
                left.push(num);
                while(!right.isEmpty()){
                    left.push(right.pop());
                }
            }
        }

        public static int remove(){
            if(left.isEmpty()){
                System.out.println("Queue is empty !");
                return -1;
            }
            return left.pop();
        }

        public static int peek(){
            if(left.isEmpty()){
                System.out.println("Queue is empty !");
                return -1;
            }
            return left.peek();
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek());
        
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
