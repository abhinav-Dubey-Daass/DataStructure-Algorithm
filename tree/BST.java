package tree;

import java.lang.annotation.ElementType;

public class BST {
    public TreeNode search(TreeNode root, int searchElement) {

        if (root != null) {

            TreeNode temp;
            if (searchElement == root.val)
                return root;
            else if (searchElement < root.val)
                temp = search(root.left, searchElement);
            else
                temp = search(root.right, searchElement);

        return temp;
    }
        return null;
}

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
//        TreeNode root1=root;
//        System.out.println(root1.val);
       if(new BST().search(root,0)!=null){
           System.out.println("!Element Found");
       }else
           System.out.println("!Element not Found");
    }
}
