import java.util.*;

public class MaxHeight{
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int sum = 1;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        sum += Math.max(lh, rh);
        return sum;
    }
}
