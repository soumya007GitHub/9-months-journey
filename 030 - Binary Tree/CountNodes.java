import java.util.*;
public class CountNodes {
    private static int index = -1;
    private static int count = 0;
    public static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    public static class BinaryTree {
        public static Node create(int[] nums) {
            index++;
            if (nums[index] == -1) {
                return null;
            }
            Node root = new Node(nums[index]);
            root.left = create(nums);
            root.right = create(nums);
            return root;
        }
        public static int totalNodes(Node root){
            if(root == null){
                return 0;
            }
            int lh = totalNodes(root.left);
            int rh = totalNodes(root.right);
            
            return lh+rh+1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {10, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryTree.create(nums);
        System.out.println(BinaryTree.totalNodes(root));
    }
}
