import java.util.LinkedList;

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

    public void printTree() {
        int counter = 0;
        int height = heightOfTree(root)-1;
        LinkedList<TreeNode> treeLevel = new LinkedList<TreeNode>();
        treeLevel.add(root);
        LinkedList<TreeNode> temp = new LinkedList<TreeNode>();

        double numberOfElements = (Math.pow(2 , (height + 1)) - 1);

        while (counter <= height) {
            TreeNode removed = treeLevel.removeFirst();
            if (temp.isEmpty())
                printSpace(numberOfElements / Math.pow(2 , counter + 1), removed);
            else
                printSpace(numberOfElements / Math.pow(2 , counter), removed);

            if (removed == null) {
                temp.add(null);
                temp.add(null);
            } else {
                temp.add(removed.getLeftNode());
                temp.add(removed.getRightNode());
            }

            if (treeLevel.isEmpty()) {
                System.out.println("\n");
                treeLevel = temp;
                temp = new LinkedList<>();
                counter++;
            }

        }
    }

    private void printSpace(double n, TreeNode removed){
        for(;n>0;n--)
            System.out.print("\t");
        if(removed == null)
            System.out.print(" ");
        else
            System.out.print(removed.getData());
    }

    private int heightOfTree(TreeNode root){
        if(root==null) return 0;
        return 1+ Math.max(heightOfTree(root.getLeftNode()),heightOfTree(root.getRightNode()));
    }
}