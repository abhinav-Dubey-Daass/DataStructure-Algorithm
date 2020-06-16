package tree;



import java.util.*;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            List<TreeNode> row = deleteAll(queue);
            for (int i = 0; i < row.size(); i++) {
                TreeNode node = row.get(i);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(convertListGenericTypetoInteger(row));
        }
        return result;
    }

    public List<TreeNode> deleteAll(Queue<TreeNode> queue) {
        List<TreeNode> row = new ArrayList<>();
        while (!queue.isEmpty()) {
            row.add(queue.remove());
        }
        return row;

    }

    public List<Integer> convertListGenericTypetoInteger(List<TreeNode> list) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            resultList.add(list.get(i).val);
        }

        return resultList;
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
        System.out.println(new LevelOrderTraversal().levelOrderRecursion(root));
//new LevelOrderTraversal().initList();
//        String data = String.valueOf(root);
//        String data1 = root.toString();
//        System.out.println(root);
//        System.out.println(data);
//        System.out.println(data1);
//        new LevelOrderTraversal().levelOrder(root);
//
//        Queue<TreeNode> queue=new LinkedList<>();
//        queue.add(root);
//        queue.add(root.left);
//        queue.add(root.right);
//        System.out.println("List");
//        System.out.println(new LevelOrderTraversal().deleteAll(queue));
//        System.out.println("queue");
//        System.out.println(queue);
    }

    public List<List<TreeNode>> levelOrderRecursion(TreeNode root) {
        int level = 0;
        List<List<TreeNode>> resultList = new ArrayList<>();
        resultList = levelOrder(root, level, resultList);
        return resultList;
    }

    public List<List<TreeNode>> levelOrder(TreeNode root, int level, List<List<TreeNode>> list) {
        if (root == null) {
            return list;
        }
        List<TreeNode> row=addInList(list, level, root);
        list.set(level, row);
        levelOrder(root.left, level + 1, list);
        levelOrder(root.right, level + 1, list);
        return list;
    }

    public List<TreeNode> addInList(List<List<TreeNode>> list, int level, TreeNode root) {
        List<TreeNode> row;
        if(level==0)
         {
            row = new ArrayList<>();
            row.add(root);
            return row;
        }
        row = list.get(level);
        row.add(root);
        return row;
    }

    //


    public void initList() {
        List<List<Integer>> initList = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row.add(5);
        row.add(6);
        initList.add(0, row);
        initList.add(1, row1);
        initList.add(2, null);
        updatelist(initList);
        System.out.println(initList);
    }

    //    public List updatelist(List<Integer> list){
//        list.set(1,list.get(1)+2);
//        return list;
//    }
    public List<List<Integer>> updatelist(List<List<Integer>> list) {
        if (list.get(2) == null) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            list.set(2, row);
        }
        return list;
    }

}
