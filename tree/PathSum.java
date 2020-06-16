package tree;

public class PathSum {
//    public boolean hasPathSum(TreeNode root, int sum) {
//        int count = 0;
//        int countPaths = hasPathSum(root, sum, count);
//        if (countPaths != 0)
//            return true;
//        return false;
//    }

//    public int hasPathSum(TreeNode root, int sum, int count) {
//        if (root != null) {
//            //for lead node condition or base condition
//            if (root.left == null && root.right == null) {
//                if ((root.data - sum) != 0) {
//                    return count;
//                }
//                return count + 1;
//            }
//            sum = sum - root.data;
//            count = hasPathSum(root.left, sum, count);
//            count = hasPathSum(root.right, sum, count);
//
//            return count;
//        }
//        return count;
//    }

//    public int noOfpath(TreeNode root, int sum) {
//        int count = 0;
//        hasPathSum(root, sum);
//        return count;
//    }

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
        int sum = 22;
        //calling hasPathSum function whether it has path that sums to given sum
        if (new PathSum().hasPathSum(root, sum)) {
            System.out.println("Yes ,It has a path that sums to given path, no. of paths ");
        } else {
            System.out.println("No! it has not a path that sums to given sum");
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root != null) {

            if (root.left == null && root.right == null) {
                if ((root.val - sum) != 0) {
                    return false;
                }
                return true;
            }
            sum = sum - root.val;
            boolean leftResult = hasPathSum(root.left, sum);
            boolean rightResult = hasPathSum(root.right, sum);

            return leftResult || rightResult;
        }
        return false;
    }
}
