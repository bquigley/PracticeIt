/*
 Write a method size that returns the total number of nodes in the tree. For example, the following tree has a size of 8:

               +---+
               | 6 |
           ___ +---+ ___
         /               \
     +---+               +---+
     | 3 |               | 2 |
     +---+               +---+
    /     \             /     \
+---+     +---+     +---+     +---+
| 1 |     | 4 |     | 6 |     | 4 |
+---+     +---+     +---+     +---+
                                   \
                                   +---+
                                   | 0 |
                                   +---+

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;   // null for an empty tree
    ...
}

*/


/*
public int size() {
    return __getSize();
}
*/


public int size() {
    // use array to force the int pass by reference
    int[] n = new int[1];
    
    inOrderParse(overallRoot, n);
    return n[0];
}

public void inOrderParse(IntTreeNode node, int[] n) {
    if (node == null)
	return;

    inOrderParse(node.left, n);
    n[0]++;
    inOrderParse(node.right, n);
}

