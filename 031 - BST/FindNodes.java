
class FindNodes{
    
    public ArrayList<Integer> array = new ArrayList<>();
    public ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        traverse(root, low, high);
        return array;
    }
    public void traverse(Node root, int low, int high){
        if(root == null){
            return;
        }
        if(root.data >= low){
            traverse(root.left, low, high);
        }
        if(root.data >= low && root.data<=high){
            array.add(root.data);
        }
        if(root.data <= high){
            traverse(root.right, low, high);
        }
    }
}