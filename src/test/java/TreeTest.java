import org.junit.*;

import static org.junit.Assert.*;

public class TreeTest {
    TreeNode root;
    Tree tree;
    int value;

    @Before
    public void init() {
        tree = new Tree();
        root = null;
        value = 5;
    }

    @Test
    public void shouldInsertNode() {
        root = new TreeNode(value);
        tree.insertNode(value);
        assertNotNull(root);
    }

    @Test
    public void shouldInsertValueOnRoot() {
        root = new TreeNode(value);
        root.insert(value);
        assertNotNull(root);
    }
}
