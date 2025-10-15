public class CircularQueue {

    public static class Queue{
        static int array[];
        static int size;
        static int front;
        static int rear;

        Queue(int n){
            array = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty(){
            if(front == -1 && rear == -1){
                return true;
            }
            return false;
        }
        public static boolean isFull(){
            if(front == (rear+1)%size){
                return true;
            }
            return false;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = (front + 1)%size;
            }
            rear = (rear+1)%size;
            array[rear] = data;
        }

        public static int delete(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = array[front];
           if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return array[front];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(3);
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek());
        q.delete();
        System.out.println(q.peek());
    }
}
