import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insertNode(5);
        tree.insertNode(1);
        tree.insertNode(7);
        tree.insertNode(3);
        tree.insertNode(9);
        tree.insertNode(2);
        tree.insertNode(12);


        printBinaryTree(tree.getRoot());
    }

    public static void printBinaryTree(TreeNode root) {
        LinkedList<TreeNode> treeLevel = new LinkedList<TreeNode>();
        treeLevel.add(root);
        LinkedList<TreeNode> temp = new LinkedList<TreeNode>();
        int counter = 0;
        int height = heightOfTree(root)-1;

        double numberOfElements = (Math.pow(2 , (height + 1)) - 1);

        while (counter <= height) {
            TreeNode removed = treeLevel.removeFirst();
            if (temp.isEmpty()) {
                printSpace(numberOfElements / Math.pow(2 , counter + 1), removed);
            } else {
                printSpace(numberOfElements / Math.pow(2 , counter), removed);
            }
            if (removed == null) {
                temp.add(null);
                temp.add(null);
            } else {
                temp.add(removed.getLeftNode());
                temp.add(removed.getRightNode());
            }

            if (treeLevel.isEmpty()) {
                System.out.println("");
                System.out.println("");
                treeLevel = temp;
                temp = new LinkedList<>();
                counter++;
            }

        }
    }

    public static void printSpace(double n, TreeNode removed){
        for(;n>0;n--) {
            System.out.print("\t");
        }
        if(removed == null){
            System.out.print(" ");
        }
        else {
            System.out.print(removed.getData());
        }
    }

    public static int heightOfTree(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+ Math.max(heightOfTree(root.getLeftNode()),heightOfTree(root.getRightNode()));
    }

}
