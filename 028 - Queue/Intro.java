public class Intro {

    public static class Queue{
        static int array[];
        static int size;
        static int rear;

        Queue(int n){
            array = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            if(rear == -1){
                return true;
            }
            return false;
        }
        public static boolean isFull(){
            if(rear == size-1){
                return true;
            }
            return false;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            rear = rear+1;
            array[rear] = data;
        }

        public static int delete(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = array[0];
            for(int i = 1; i<=rear; ++i){
                array[i-1] = array[i];
            }
            rear = rear - 1;
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return array[0];
        }
    }
    public static void main(String args[]){
        Queue obj = new Queue(3);
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        System.out.println(obj.peek());
        obj.delete();
        System.out.println(obj.peek());
        obj.delete();
        System.out.println(obj.peek());
        obj.delete();
        System.out.println(obj.peek());
        obj.delete();
    }
}
