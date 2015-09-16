/* Write a method makePerfect that could be added to the IntTree class. The method should add nodes until the binary tree is a "perfect" tree. A perfect binary tree is one where all leaves are at the same level. Another way of thinking of it is that you are adding dummy nodes to the tree until every path from the root to a leaf is the same length. A perfect tree's shape is exactly triangular and every branch node has exactly two children. Each node you add to the tree should store the value 0.

The following table shows the results of a call of your method on a particular IntTree variable named tree:

IntTree tree = new IntTree();
...
tree.makePerfect();

before call 	after call>

                 +----+
                 | 67 |
                 +----+
              /          \
           /                \
      +----+                +----+
      | 80 |                | 52 |
      +----+                +----+
     /      \              /
    /        \            /
+----+     +----+      +----+
| 16 |     | 21 |      | 99 |
+----+     +----+      +----+
            /  \           \
           /    \           \
       +----+  +----+      +----+
       | 45 |  | 33 |      | 67 |
       +----+  +----+      +----+

	

                        +----+
                        | 67 |
                        +----+
                    /             \
                /                     \
           +----+                     +----+
           | 80 |                     | 52 |
           +----+                     +----+
         /        \                 /        \
       /            \             /            \
   +----+         +----+       +----+        +----+
   | 16 |         | 21 |       | 99 |        |  0 |
   +----+         +----+       +----+        +----+
   /    \         /    \       /    \        /     \
  /      \       /      \     /      \      /       \
+----+ +----+ +----+ +----+ +----+ +----+ +----+ +----+
|  0 | |  0 | | 45 | | 33 | |  0 | | 67 | |  0 | |  0 |
+----+ +----+ +----+ +----+ +----+ +----+ +----+ +----+

For this problem, you may assume the existence of the following helper method, which you are allowed to call at most once during an entire call to your method:

public int height() { ... }   // returns height of tree from root to lowest leaf

For example, calling height on the tree above would return 4 because it is 4 levels tall.

You may define private helper methods, but aside from height you may not call any other methods of the class nor create any data structures. Your solution should be recursive and utilize the x = change(x) pattern discussed in the Building Java Programs textbook.

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}


*/

public void makePerfect() {
    _makePerfect(overallRoot, height(), 1);
}

private void _makePerfect(IntTreeNode node, int height, int level) {
    if (level >= height)
	return;
    if (node.left == null)
	node.left = new IntTreeNode(0, null, null);
    if (node.right == null)
	node.right = new IntTreeNode(0, null, null);
    _makePerfect(node.left, height, level+1);
    _makePerfect(node.right, height, level+1);
}


// LEAVE THESE METHODS HERE, TO USE AS HELPERS
public int height() {
    return height(overallRoot);
}

private int height(IntTreeNode root) {
    if (root == null) {
        return 0;
    } else {
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
