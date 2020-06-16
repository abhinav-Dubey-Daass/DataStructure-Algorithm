package tree;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class BalancedTree {
    public boolean isBalanced(TreeNode root) {
        int height = 0;
        isBalanced(root, height);
        return false;

    }

    public boolean isBalanced(TreeNode root, int height) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                return true;
            }
            boolean left = isBalanced(root.left, height + 1);
            boolean right = isBalanced(root.right, height + 1);
//            if()

        }
        return false;

    }
}
