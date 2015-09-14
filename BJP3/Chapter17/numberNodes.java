/*
 Write a method numberNodes that changes the data stored in a binary tree, assigning sequential integers starting with 1 to each node so that a pre-order traversal will produce the numbers in order(1, 2, 3, etc.). For example, given the tree referenced by tree below at left, the call of tree.numberNodes(); would overwrite the existing data assigning the nodes values from 1 to 6 so that a pre-order traversal of the tree would produce 1, 2, 3, 4, 5, 6.
Before Call 	After Call

          +---+
          | 7 |
          +---+
         /     \
     +---+     +---+
     | 3 |     | 9 |
     +---+     +---+
    /     \         \
+---+     +---+     +---+
| 9 |     | 2 |     | 0 |
+---+     +---+     +---+

	

          +---+
          | 1 |
          +---+
         /     \
     +---+     +---+
     | 2 |     | 5 |
     +---+     +---+
    /     \         \
+---+     +---+     +---+
| 3 |     | 4 |     | 6 |
+---+     +---+     +---+

You are not to change the structure of the tree. You are simply changing the values stored in the data fields. Your method should return a count of how many nodes were in the tree.

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}
*/

public int numberNodes() {
    int[] n = new int[1];
    _numberNodes(overallRoot, n);
    return n[0];
}

public void _numberNodes(IntTreeNode node, int[] n) {
    if (node == null)
	return;
    node.data = ++n[0];
    _numberNodes(node.left, n);
    _numberNodes(node.right, n);
}


