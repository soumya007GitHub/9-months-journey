import java.util.*;

public class StackUsingQueues {
    public static class StackClass{
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public static void add(int num){
        if(q1.isEmpty() && q2.isEmpty()){
            q1.add(num);
            return;
        }
        if(!q1.isEmpty()){
            q1.add(num);
        }else{
            q2.add(num);
        }
    }
    public static int delete(){
        int temp = 0;
        if(q1.isEmpty() && q2.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            while(!q1.isEmpty()){
                temp = q1.remove();
                if(q1.isEmpty()){
                    return temp;
                }
                q2.add(temp);
            }
            while(!q2.isEmpty()){
                temp = q2.remove();
                if(q2.isEmpty()){
                    return temp;
                }
                q1.add(temp);
            }
        }
        return temp;
    }

    public static int peek(){
        int temp = 0;
        if(q1.isEmpty() && q2.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            while(!q1.isEmpty()){
                temp = q1.remove();
                q2.add(temp);
            }
            while(!q2.isEmpty()){
                temp = q2.remove();
                q1.add(temp);
            }
        }
        return temp;
    }
}
    public static void main(String args[]){
        StackClass obj = new StackClass();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        System.out.println(obj.peek());
        int lastDeleted = obj.delete();
        System.out.println(lastDeleted);
        System.out.println(obj.peek());
    }
}
