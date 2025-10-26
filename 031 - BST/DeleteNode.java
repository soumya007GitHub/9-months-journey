
public class DeleteNode {

    public static class Node {
        int data;
        Node left = null;
        Node right = null;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node bst(Node root, int val) {
        if (root == null) {
            Node node = new Node(val);
            root = node;
            return root;
        }
        if (val < root.data) {
            root.left = bst(root.left, val);
        } else {
            root.right = bst(root.right, val);
        }
        return root;
    }

    public static void show(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            show(root.left);
        }
        System.out.println(root.data);
        if (root.right != null) {
            show(root.right);
        }
    }

    public static Node deleteNode(Node root, int key) {
        if(root == null){
            return null;
        }
        else if(root.data < key){
            root.right = deleteNode(root.right, key);
        }
        else if(root.data > key){
            root.left = deleteNode(root.left, key);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            else{
                Node lastNode = helper(root.right);
                root.data = lastNode.data;
                root.right = deleteNode(root.right, lastNode.data);
            }
        }
            return root;
    }
    public static Node helper(Node root){
        if(root.left != null){
           return helper(root.left);
        }
        return root;
    }
    public static void main(String args[]) {
        int arr[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < arr.length; ++i) {
            root = bst(root, arr[i]);
        }
        int term = 3;
        deleteNode(root, term);
        show(root);
    }
}
