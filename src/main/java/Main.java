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

        tree.printTree();
    }

}
