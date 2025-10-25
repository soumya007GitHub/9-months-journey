import java.util.*;

// Helper class to store node along with its horizontal distance
class Info {
    TreeNode node;
    int hd; // horizontal distance

    Info(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

// Main Solution class
public class Solution {

    public static List<Integer> getTopView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if (root == null) return ans;

        // Queue for level order traversal
        Queue<Info> q = new LinkedList<>();
        // Map to store first node at every horizontal distance
        Map<Integer, Integer> map = new TreeMap<>();

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            // If this horizontal distance is seen for the first time
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.val);
            }

            // Add left and right children
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
            }
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
            }
        }

        // Extract the values from TreeMap (sorted by hd)
        for (int val : map.values()) {
            ans.add(val);
        }

        return ans;
    }
}
