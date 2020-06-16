package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LevelOrderTraversalMapRecursion {
    public HashMap<Integer, List<TreeNode>> levelOrderRecursion(TreeNode root) {
        int level = 0;
        HashMap<Integer, List<TreeNode>> resultMap = new HashMap<>();
        resultMap = levelOrder(root, level, resultMap);
        return resultMap;
    }

    public HashMap<Integer, List<TreeNode>> levelOrder(TreeNode root, int level, HashMap<Integer, List<TreeNode>> map) {
        if (root == null) {
            return map;
        }
        List<TreeNode> row = addInList(map, level, root);
        map.put(level, row);
        levelOrder(root.left, level + 1, map);
        levelOrder(root.right, level + 1, map);
        return map;
    }

    public List<TreeNode> addInList(HashMap<Integer, List<TreeNode>> map, int level, TreeNode root) {
        List<TreeNode> row;
        if (map.get(level) == null) {
            row = new ArrayList<>();
            row.add(root);
            return row;
        }
        row=map.get(level);
        row.add(root);
        return row;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        System.out.println(new LevelOrderTraversalMapRecursion().convertMaptoList(new LevelOrderTraversalMapRecursion().levelOrderRecursion(root)));
    }
    public List<List<TreeNode>> convertMaptoList(HashMap<Integer,List<TreeNode>> map){
        List<List<TreeNode>> list=new ArrayList<>();
        for(int key=0;key<map.size();key++){
            list.add(key,map.get(key));
        }
        return list;
    }
}
