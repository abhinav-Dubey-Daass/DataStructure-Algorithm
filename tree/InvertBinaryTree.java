package tree;


class TreeNode {
    int val;
    double val1;

    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
    TreeNode(double val) {
        this.val1 = val;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }
}

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            if (root.right == null && root.left == null) {
                return root;
            }
            invertTree(root.left);
            invertTree(root.right);
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        return root;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(11);
        root.left.right = new TreeNode(111);
        root.right = new TreeNode(12);
        root.right.left = new TreeNode(122);
        System.out.println("***************Before Invert********");
        new InvertBinaryTree().postOrder(root);
        //invertTree function call
        new InvertBinaryTree().invertTree(root);
        System.out.println();
        System.out.println("***********After Invert************");
        new InvertBinaryTree().postOrder(root);
    }
    public void postOrder(TreeNode root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val +" ");
        }

    }
}
