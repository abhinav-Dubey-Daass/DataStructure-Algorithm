package tree;

class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p != null && q != null) {
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            if (p.val == q.val) {
                return left && right;
            }
            return false;
        }
        return false;
    }

}