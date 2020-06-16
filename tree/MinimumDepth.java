package tree;

public class MinimumDepth {
    public int minDepth(Node root) {

        if (root != null) {
            if (root.leftChild == null && root.rightChild == null) {
                return 1;
            }
            int leftMin = minDepth(root.leftChild);
            int rightMin = minDepth(root.rightChild);
            if (leftMin == 0) {
                return rightMin + 1;
            } else if (rightMin == 0) {
                return leftMin + 1;
            } else {
                if (leftMin <= rightMin) {
                    return leftMin + 1;
                } else {
                    return rightMin + 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.leftChild=new Node(2);
        root.rightChild=new Node(21);
        Node temp=root.leftChild;
        root.leftChild=root.rightChild;
        root.rightChild=temp;

        System.out.println("left child "+root.leftChild.data);
        System.out.println("right child "+root.rightChild.data);

    }
}