package AlgorithmDSA.Searching.Interview;

public class BSTreeNode {
    private int key;
    private BSTreeNode leftChild;
    private BSTreeNode rightChild;

    // Constructor
    public BSTreeNode(int key) {
        this.key = key;
        this.leftChild = null;
        this.rightChild = null;
    }

    // Getter and setter methods
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public BSTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BSTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BSTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BSTreeNode rightChild) {
        this.rightChild = rightChild;
    }
}

 class BinarySearchTree {
    private BSTreeNode root;

    // Constructor
    public BinarySearchTree() {
        this.root = null;
    }

    // Method to insert a key into the tree
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private BSTreeNode insertRec(BSTreeNode root, int key) {
        if (root == null) {
            root = new BSTreeNode(key);
            return root;
        }

        if (key < root.getKey()) {
            root.setLeftChild(insertRec(root.getLeftChild(), key));
        } else if (key > root.getKey()) {
            root.setRightChild(insertRec(root.getRightChild(), key));
        }

        return root;
    }

    // Method to perform an inorder traversal of the tree
    public void inorderTraversal(BSTreeNode root) {
        if (root != null) {
            inorderTraversal(root.getLeftChild());
            System.out.print(root.getKey() + " ");
            inorderTraversal(root.getRightChild());
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert some keys into the tree
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Perform an inorder traversal of the tree
        System.out.println("Inorder traversal of the binary search tree:");
        bst.inorderTraversal(bst.root); // Output: 20 30 40 50 60 70 80
    }
}
