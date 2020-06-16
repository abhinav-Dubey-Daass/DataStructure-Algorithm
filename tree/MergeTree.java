package tree;

public class MergeTree {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode root;
        if (t1 == null && t2 == null)
            return null;
        if (t1 != null && t2 != null) {
             root = new TreeNode(t1.val + t2.val);
            root.left = mergeTrees(t1.left, t2.left);
            root.right = mergeTrees(t1.right, t2.right);
            return root;
        }
        if (t1 == null) {
            return t2;
        }
        return t1;

    }

}
