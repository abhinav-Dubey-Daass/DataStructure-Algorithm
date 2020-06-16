package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class AvgOfLevelBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            List<TreeNode> row = deleteAll(queue);
            for (int i = 0; i < row.size(); i++) {
                TreeNode node = row.get(i);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            resultList.add(average(row));
        }
        return resultList;
    }

    public List<TreeNode> deleteAll(Queue<TreeNode> queue) {
        List<TreeNode> row = new LinkedList<>();
        while (!queue.isEmpty()) {
            row.add(queue.remove());
        }
        return row;
    }

    public double average(List<TreeNode> list) {
        double sum = 0;
        int size=list.size();
        for (TreeNode treeNode : list) {
            sum = sum + treeNode.val;
        }
        return sum/size;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(11);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root.left);
        queue.add(root.right);
        List<TreeNode> list = new AvgOfLevelBinaryTree().deleteAll(queue);
        System.out.println("List");
        System.out.println(list);

    }


}
