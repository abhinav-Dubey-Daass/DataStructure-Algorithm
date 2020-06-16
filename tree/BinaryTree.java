package tree;


import java.util.Stack;

class Node {
    int data;
    Node leftChild;
    Node rightChild;

    Node(int key) {
        this.data = key;
        leftChild = null;
        rightChild = null;
    }

}

public class BinaryTree {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.leftChild = new Node(2);

        Node root2 = new Node(1);
        root2.rightChild = new Node(3);



    }


}

class TreeTraversal {
    public void preOrder(Node root) {

        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.leftChild);
            System.out.print(root.data + " ");
            inOrder(root.rightChild);
        }
    }

    public void postOrder(Node root) {

        if (root != null) {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.print(root.data + " ");
        }
    }
}




