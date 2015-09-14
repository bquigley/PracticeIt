/*
 Write a method isFull that returns whether or not a binary tree is full (true, if it is, false if otherwise). A full binary tree is one in which every node has 0 or 2 children. Below are examples of each.
full tree 	not a full tree

          +---+
          | 2 |
          +---+
         /     \
     +---+     +---+
     | 3 |     | 1 |
     +---+     +---+
    /     \
+---+     +---+
| 8 |     | 7 |
+---+     +---+

	

          +---+
          | 7 |
          +---+
         /     \
     +---+     +---+
     | 4 |     | 0 |
     +---+     +---+
    /     \         \
+---+     +---+     +---+
| 9 |     | 2 |     | 8 |
+---+     +---+     +---+

By definition, the empty tree is considered full.

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}
*/

public boolean isFull() {
    if (overallRoot == null)
	return true;

    return _isFull(overallRoot);
}

public boolean _isFull(IntTreeNode node) {
    if (node == null)
	return true;
    if ((node.left == null && node.right == null) ||
	(node.left != null && node.right != null)
	) {
	return _isFull(node.left) && _isFull(node.right);
    } 
    return false;
}
