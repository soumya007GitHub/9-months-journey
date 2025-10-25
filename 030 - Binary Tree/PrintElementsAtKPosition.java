public class PrintElementsAtKPosition {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class Tree{
        static int index = -1;
        public static Node binaryTree(int nums[]){
            ++index;
            if(nums[index] == -1){
                return null;
            }
            Node obj = new Node(nums[index]);
            obj.left = binaryTree(nums);
            obj.right = binaryTree(nums);
            return obj;
        }
        public void printVal(Node root, int k, int now){
            if(root == null){
                return;
            }
            if(now == k){
                System.out.println(root.data);
                return;
            }
            printVal(root.left, k, now + 1);
            printVal(root.right, k, now + 1);
        }
    }
    public static void main(String args[]){
        int nums[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree obj = new Tree();
        Node root = obj.binaryTree(nums);
        int k = 2;
        obj.printVal(root, k, 1);
    }   
}
