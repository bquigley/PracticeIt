/*
 Write a method combineWith that could be added to the IntTree class. The method accepts another binary tree of integers as a parameter and combines the two trees into a new third tree which is returned. The new tree's structure should be a union of the structures of the two original trees. It should have a node in any location where there was a node in either of the original trees (or both). The nodes of the new tree should store an integer indicating which of the original trees had a node at that position (1 if just the first tree had the node, 2 if just the second tree had the node, 3 if both trees had the node).

For example, suppose IntTree variables t1 and t2 have been initialized and store the following trees:
t1 	t2

            +----+
            |  9 |
            +----+
           /      \
          /        \
      +----+      +----+
      |  6 |      | 14 |
      +----+      +----+
     /      \           \
    /        \           \
+----+      +----+      +----+
|  9 |      |  2 |      | 11 |
+----+      +----+      +----+
           /
          /
      +----+
      |  4 |
      +----+

	

            +----+
            |  0 |
            +----+
           /      \
          /        \
      +----+      +----+
      | -3 |      |  8 |
      +----+      +----+
     /           /      \
    /           /        \
+----+      +----+      +----+
|  8 |      |  5 |      |  6 |
+----+      +----+      +----+
                  \
                   \
                  +----+
                  |  1 |
                  +----+

Then the following call:

IntTree t3 = t1.combineWith(t2);

Will return a reference to the following tree:
t3

               +---+
               | 3 |
           ___ +---+ ___
         /               \
     +---+               +---+
     | 3 |               | 3 |
     +---+               +---+
    /     \             /     \
+---+     +---+     +---+     +---+
| 3 |     | 1 |     | 2 |     | 3 |
+---+     +---+     +---+     +---+
         /               \
     +---+               +---+
     | 1 |               | 2 |
     +---+               +---+

You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class nor create any data structures such as arrays, lists, etc. Your method should not change the structure or contents of either of the two trees being compared.

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}
*/

public IntTree combineWith(IntTree other) {
    IntTree res = new IntTree();
    res.overallRoot = combine(this.overallRoot, other.overallRoot);
    return res;
}

private IntTreeNode combine(IntTreeNode node1, IntTreeNode node2) {
    if (node1 == null && node2 == null)
	return null;
    
    if (node1 == null) 
	return new IntTreeNode(2, combine(null, node2.left), combine(null, node2.right));

    if (node2 == null)
	return new IntTreeNode(1, combine(node1.left, null), combine(node1.right, null));

    return new IntTreeNode(3, combine(node1.left, node2.left), combine(node1.right, node2.right));
}


