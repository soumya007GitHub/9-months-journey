public class Intro{

    public static class Node{
        int data;
        Node left = null;
        Node right = null;
        Node(int data){
            this.data = data;
        }
    }
    public static Node bst(Node root, int val){
        if(root == null){
            Node node = new Node(val);
            root = node;
            return root;
        }
        if(val < root.data){
            root.left = bst(root.left, val);
        }
        else{
            root.right = bst(root.right, val);
        }
        return root;
    }

    public static void show(Node root){
        if(root == null){
            return;
        }
        if(root.left != null){
            show(root.left);
        }
        System.out.println(root.data);
        if(root.right != null){
            show(root.right);
        }
    }
    public static void main(String args[]){
        int arr[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int i = 0; i<arr.length; ++i){
            root = bst(root, arr[i]);
        }
        show(root);
    }
}