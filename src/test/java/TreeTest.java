import org.junit.*;

import static org.junit.Assert.*;

public class TreeTest {
    Tree tree;
    int max;
    int value;
    int children;

    @Before
    public void init() {
        tree = new Tree();
        max = 3;
        children = 2;
        //value = -1;
        value = 2;
    }

    @Test
    public void testInsertNode() {
        tree.insertNode(value);

        if (value >= max) {
            fail("El nodo no puede ser colocado porque no existen nodos padre");
        } else if (value == children) {
            fail("El nodo no pudo ser insertado porque ya hay 2 hijos en esa rama");
        } else {
            System.out.println("Todo salió perfecto");
        }
    }
}
