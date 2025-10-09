import java.util.*;

public class StackIntroArrayList {
    public static class Stack{
        public static ArrayList<Integer> stack = new ArrayList<>();
        
        public static void push(int val){
            stack.add(val);
        }
        public static int pop(){
            if(stack.size() == 0){
                return -1;
            }
           int temp =  stack.get(stack.size()-1);
           stack.remove(stack.size()-1);
           return temp;
        }
        public static int peek(){
            if(stack.size() == 0){
                return -1;
            }
            int temp =  stack.get(stack.size()-1);
            return temp;
        }
    }
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        while(obj.peek() != -1){
            System.out.println(obj.pop());
        }
    }
}