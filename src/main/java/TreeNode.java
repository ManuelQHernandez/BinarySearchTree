public class TreeNode {
    private int data;
    private TreeNode rightNode;
    private TreeNode leftNode;

    public TreeNode(int dataNode) {
        data = dataNode;
        rightNode = leftNode = null;
    }

    public void insert(int value) {

        if (value < data){

            if (leftNode == null)
                leftNode = new TreeNode(value);
            else
                leftNode.insert(value);
        }

        else if(value > data){

            if (rightNode == null)
                rightNode = new TreeNode(value);
            else
                rightNode.insert(value);
        }

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }
}
