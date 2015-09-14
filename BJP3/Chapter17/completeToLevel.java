/*
 Write a method completeToLevel that accepts an integer n as a parameter and that adds nodes to a tree so that the first n levels are complete. A level is complete if every possible node at that level is not null. We will use the convention that the overall root is at level 1, it's children are at level 2, and so on. You should preserve any existing nodes in the tree. Any new nodes added to the tree should have -1 as their data.

For example, if a variable called tree refers to the tree below at left and you make the call of tree.completeToLevel(3);, the variable tree should store the tree below at right after the call.
Before Call 	After Call

            +----+
            | 17 |
            +----+
           /      \
          /        \
      +----+      +----+
      | 83 |      |  6 |
      +----+      +----+
     /                  \
    /                    \
+----+                  +----+
| 19 |                  | 87 |
+----+                  +----+
      \                /
       \              /
      +----+      +----+
      | 48 |      | 75 |
      +----+      +----+

	

                  +----+
                  | 17 |
                _ +----+ _
            _ /            \ _
          /                    \
      +----+                  +----+
      | 83 |                  |  6 |
      +----+                  +----+
     /      \                /      \
    /        \              /        \
+----+      +----+      +----+      +----+
| 19 |      | -1 |      | -1 |      | 87 |
+----+      +----+      +----+      +----+
      \                            /
       \                          /
      +----+                  +----+
      | 48 |                  | 75 |
      +----+                  +----+

In this case, the request was to fill in nodes as necessary to ensure that the first 3 levels are complete. There were two nodes missing at level 3, Notice that level 4 of this tree is not complete because the call requested that nodes be filled in to level 3 only.

Keep in mind that your method might need to fill in several different levels. Your method should throw an IllegalArgumentException if passed a value for level that is less than 1.

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}
*/

public void completeToLevel(int level) {
    if (level < 1)
	throw new IllegalArgumentException();

    if (overallRoot == null)
	overallRoot = new IntTreeNode(-1);

    /* currentLevel start from 2, since not only add value to current node
       but also left and right child nodes
    */
    _completeToLevel(overallRoot, 2, level);
}

private void _completeToLevel(IntTreeNode node, int currentLevel, int level) {
    if (currentLevel > level)
	return;

    if (node == null)
	node = new IntTreeNode(-1);
    
    if (node.left == null) 
	node.left = new IntTreeNode(-1);
    
    if (node.right == null) 
	node.right = new IntTreeNode(-1);
    
    
    _completeToLevel(node.left, currentLevel+1, level);
    _completeToLevel(node.right, currentLevel+1, level);
}
