import static org.junit.Assert.*;
import java.lang.IndexOutOfBoundsException;
import java.util.*;

import org.junit.Test;

public class BSTTests {

    public static final double DELTA = .001;

    @Test
    public void testSimple() {

        BinarySearchTree tree = new BinarySearchTree();
        assertEquals(-1, tree.treeHeight());
        assertTrue(tree.isEmpty());

    }

}