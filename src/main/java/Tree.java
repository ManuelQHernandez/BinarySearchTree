public class Tree {

    private TreeNode root;


    public Tree() {
        root = null;
    }


    public void insertNode(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }
}