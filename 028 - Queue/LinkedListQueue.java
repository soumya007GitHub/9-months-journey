public class LinkedListQueue {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Queue{
        static Node head;
        static Node tail;

        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                tail = newNode;
                head = newNode;
            }else{
            tail.next = newNode;
            tail = newNode;
        }
        }
        public static int remove(){
            if(head == null){
                return -1;
            }
            int temp = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return temp;
        }
        public static int peek(){
            if(head == null){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
    }
}
