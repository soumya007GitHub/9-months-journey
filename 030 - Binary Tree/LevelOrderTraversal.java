import java.util.*;
public class LevelOrderTraversal {
    
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

        public static void printVal(Node root) {
            if (root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                int levelSize = q.size();

                for (int i = 0; i < levelSize; i++) {
                    Node current = q.remove();
                    System.out.print(current.data + " ");

                    if (current.left != null) q.add(current.left);
                    if (current.right != null) q.add(current.right);
                }

                System.out.println();
            }}
    }
    public static void main(String args[]){
        int nums[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree obj = new Tree();
        Node root = obj.binaryTree(nums);
        obj.printVal(root);
    }
}
