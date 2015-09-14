/*
 Write a method countLeftNodes that returns the number of left children in the tree. A left child is a node that appears as the root of the left-hand subtree of another node. An empty tree has 0 left nodes. For example, the following tree has four left children (the nodes storing the values 5, 1, 4, and 7):

          +---+
          | 3 |
          +---+
         /     \
     +---+     +---+
     | 5 |     | 2 |
     +---+     +---+
    /         /     \
+---+     +---+     +---+
| 1 |     | 4 |     | 6 |
+---+     +---+     +---+
         /
     +---+
     | 7 |
     +---+

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}
*/

public int countLeftNodes() {
    int[] n = new int[1];
    inOrderParse(overallRoot, n);
    return n[0];
}


public void inOrderParse(IntTreeNode node, int[] n) {
    if (node == null)
	return;
    if (node.left != null)
	n[0]++;
    inOrderParse(node.left, n);
    // no operation for node
    inOrderParse(node.right, n);
}
