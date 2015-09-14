/*
 Write a method countEvenBranches that returns the number of branch nodes in a binary tree that contain even numbers. A branch node is one that has one or two children (i.e., not a leaf node). An empty tree has 0 even branches. For example, if a variable tree stores a reference to the following tree:

          +---+
          | 2 |
          +---+
         /     \
     +---+     +---+
     | 8 |     | 1 |
     +---+     +---+
    /         /     \
+---+     +---+     +---+
| 0 |     | 7 |     | 6 |
+---+     +---+     +---+
         /               \
     +---+               +---+
     | 4 |               | 9 |
     +---+               +---+

Then the call tree.countEvenBranches(); should return 3 because there are three branch nodes with even values (2, 8, and 6). Notice that the leaf nodes with even values are not included (the nodes storing 0 and 4).

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}
*/

public int countEvenBranches() {
    int[] n = new int[1];
    parseTree(overallRoot, n);
    return n[0];
}

public void parseTree(IntTreeNode node, int[] n) {
    if (node == null)
	return;
    if (node.left != null || node.right != null) {
	if (node.data % 2 == 0)
	    n[0]++;
    }
    parseTree(node.left, n);
    parseTree(node.right, n);
}
