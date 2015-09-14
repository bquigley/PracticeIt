/*
 Write a method doublePositives that doubles all data values greater than 0 in a binary tree of integers. For example, the before and after of a call to doublePositives on a sample tree are shown below:
Before Call 	After Call

            +----+
            | -9 |
            +----+
           /      \
          /        \
      +----+      +----+
      |  3 |      | 15 |
      +----+      +----+
     /           /      \
    /           /        \
+----+      +----+      +----+
|  0 |      | 12 |      | 24 |
+----+      +----+      +----+
           /      \
          /        \
      +----+      +----+
      |  6 |      | -3 |
      +----+      +----+

	

            +----+
            | -9 |
            +----+
           /      \
          /        \
      +----+      +----+
      |  6 |      | 30 |
      +----+      +----+
     /           /      \
    /           /        \
+----+      +----+      +----+
|  0 |      | 24 |      | 48 |
+----+      +----+      +----+
           /      \
          /        \
      +----+      +----+
      | 12 |      | -3 |
      +----+      +----+

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}
*/

public void doublePositives() {
    _doublePositives(overallRoot);
}

private void _doublePositives(IntTreeNode node) {
    if (node == null)
	return;
    if (node.data > 0)
	node.data *= 2;
    _doublePositives(node.left);
    _doublePositives(node.right);
}

