/*
 Write a method printLeaves that outputs the leaves of a binary tree from right to left. More specifically, the leaves should be printed in the reverse order that they would be printed using any of the standard traversals. For example, if a variable tree stores a reference to the following tree:

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

Then the call of t.printLeaves(); should produce the following output:

leaves: 9 4 0

If the tree does not have any leaves (an empty tree), simply print:

no leaves

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}
*/

public void printLeaves() {
    if (overallRoot == null){
	System.out.println("no leaves");
	return;
    }
    
    System.out.print("leaves: ");
    printLeaves_internal(overallRoot);
}

public void printLeaves_internal(IntTreeNode node) {
    if (node == null)
	return;
    if (node.left == null && node.right == null) {
	System.out.print(node.data + " ");
    }
    printLeaves_internal(node.right);
    printLeaves_internal(node.left);
}

