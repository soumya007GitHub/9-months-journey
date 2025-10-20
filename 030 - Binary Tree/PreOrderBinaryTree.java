public class PreOrderBinaryTree {

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
        public static Node binaryTree(int nums[], int index){
            if(nums[index] == -1){
                return null;
            }
            Node obj = new Node(nums[index]);
            obj.left = binaryTree(nums, ++index);
            obj.right = binaryTree(nums, ++index);
            return obj;
        }
    }
    public static void main(String args[]){
        int nums[] = {10, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree obj = new Tree();
        System.out.println(obj.binaryTree(nums, 0).data);
    }
}
