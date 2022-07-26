import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeNodeTest {
    private TreeNode node;
    private int nodeValue;

    @Before
    public void initNode() {
        nodeValue = 5;
        node = new TreeNode(nodeValue);
    }

    @Test
    public void shouldInsertNode() {
        int valueToInsert = ++nodeValue;
        node.insert(valueToInsert);
        assertNotNull(node.getRightNode());
    }

    @Test
    public void shouldInsertBiggerValueAtRight() {
        int valueToInsert = ++nodeValue;
        node.insert(valueToInsert);
        assertEquals(valueToInsert, node.getRightNode().getData());
    }

    @Test
    public void shouldInsertSmallerValueAtLeft() {
        int valueToInsert = --nodeValue;
        node.insert(valueToInsert);
        assertEquals(valueToInsert, node.getLeftNode().getData());
    }

}