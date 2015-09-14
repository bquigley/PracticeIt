/*
 Write a method removeLeaves that removes the leaves from a tree. A leaf node that has empty left and right subtrees. If a variable tree refers to the first tree below, the call of tree.removeLeaves(); should remove the four leaves from the tree (the nodes with data values 1, 4, 6, and 0) leaving the next tree shown below.

A second call on the method would eliminate the two leaves in this tree (the nodes with data values 3 and 8), shown in the third tree below. A third call would eliminate the one leaf with data value 9, and a fourth call would leave an empty tree because the previous tree was exactly one leaf node. If your method is called on an empty tree, the method does not change the tree because there are no nodes of any kind (leaf or not).
Call 	# 	Tree
(before call) 	0 	

               +---+
               | 7 |
           ___ +---+ ___
         /               \
     +---+               +---+
     | 3 |               | 9 |
     +---+               +---+
    /     \             /     \
+---+     +---+     +---+     +---+
| 1 |     | 4 |     | 6 |     | 8 |
+---+     +---+     +---+     +---+
                                   \
                                   +---+
                                   | 0 |
                                   +---+

tree.removeLeaves(); 	1 	

               +---+
               | 7 |
               +---+
              /     \
          +---+     +---+
          | 3 |     | 9 |
          +---+     +---+
                         \
                         +---+
                         | 8 |
                         +---+

2 	

               +---+
               | 7 |
               +---+
                    \
                    +---+
                    | 9 |
                    +---+

3 	

               +---+
               | 7 |
               +---+

4 	

               null

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}

*/


public void removeLeaves() {
   overallRoot = _removeLeaves(overallRoot);
}

private IntTreeNode _removeLeaves(IntTreeNode node) {
    if (node == null)
	return null;
        
    if (isLeaf(node)) {
	return null;
    }

    node.left = _removeLeaves(node.left);
    node.right = _removeLeaves(node.right);
    return node;
}

private boolean isLeaf(IntTreeNode node) {
    if (node.left == null && node.right == null)
	return true;
    return false;
}




