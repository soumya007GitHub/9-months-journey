import java.util.*;
class FindNodes{
    
    public ArrayList<Integer> array = new ArrayList<>();
    public ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        traverse(root, low, high);
        Collections.sort(array);
        return array;
    }
    public void traverse(Node root, int low, int high){
        if(root == null){
            return;
        }
        if(root.data >= low && root.data<=high){
            array.add(root.data);
        }else{
            return;
        }
        traverse(root.left, low, high);
        traverse(root.right, low, high);
    }
}