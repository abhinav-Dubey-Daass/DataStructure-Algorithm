package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewOfBinaryTree {
    public List<Integer> rightSideView(TreeNode root) {


        return new ArrayList<>();
    }

    public void rightView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            System.out.println("!Error Tree Does not exist");
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node=queue.remove();
            System.out.println(node);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(21);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(41);
        root.right.left.left = new TreeNode(31);
        root.right.left.left.left = new TreeNode(11);

        new RightViewOfBinaryTree().rightView(root);
    }
}
