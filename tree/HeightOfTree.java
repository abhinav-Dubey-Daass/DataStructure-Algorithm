package tree;

public class HeightOfTree {

    public int height(TreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                System.out.println("Height of " + root.val + "= " + 0);
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            if (leftHeight < rightHeight) {
                System.out.println("height of " + root.val + " =" + (rightHeight + 1));
                return rightHeight + 1;
            }
            System.out.println("height of " + root.val + " =" + (leftHeight + 1));
            return leftHeight + 1;
        }
        System.out.println("height of null is zero");
        return 0;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.right = new TreeNode(9);
        root.left.right = new TreeNode(11);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(2);
        new HeightOfTree().height(root);
    }

}