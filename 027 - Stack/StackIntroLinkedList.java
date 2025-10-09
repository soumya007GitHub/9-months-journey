public class StackIntroLinkedList {
    public static class Stack{
        public static class Node{
            int val;
            Node next;
            Node(int val){
                this.val = val;
                this.next = null;
            }
        }

        public static Node head = null;

        public static void push(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
        }
        public static int pop(){
            if(head == null){
                return -1;
            }
            int top = head.val;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(head == null){
                return -1;
            }
            return head.val;
        }
    }
    public static void main(String args[]){
        Stack obj = new Stack();
        obj.push(3);
        obj.push(2);
        obj.push(1);
        while(obj.peek() != -1){
            System.out.println(obj.peek());
            obj.pop();
        }
    }
}
