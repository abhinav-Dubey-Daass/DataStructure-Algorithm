package tree;

class Univalued {
//previouse i used a check variable that has disadvantage that if u call that function again it will show u the last updated check value.
    public  boolean isUnivalue(Node root) {
        int checkValue = root.data;
        return isUnivalue(root, checkValue);

    }

    public boolean isUnivalue(Node root, int checKValue) {
        if (root != null) {
            boolean leftResult = isUnivalue(root.leftChild, checKValue);
            boolean rightResult = isUnivalue(root.rightChild, checKValue);
            boolean currentResult = (root.data == checKValue);
            return leftResult && rightResult && currentResult;
        }
        return true;
    }

    public static void main(String[] args) {
        Node root = new Node(0);
//        root.rightChild=new Node(1);
//        root.leftChild=new Node(1);
//        root.leftChild.leftChild=new Node(2);
//        root.leftChild.rightChild=new Node(1);

        if (new Univalued().isUnivalue(root)) {
            System.out.println("Tree is Univalued");
        } else {
            System.out.println("Tree is not Univalued");
        }
    }
}
