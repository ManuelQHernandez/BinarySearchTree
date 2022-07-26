public class Tree {

    private TreeNode root;


    public Tree() {
        root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void insertNode(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }
}