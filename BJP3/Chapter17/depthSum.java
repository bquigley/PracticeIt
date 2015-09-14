/*
 Write a method depthSum that returns the sum of the values stored in a binary tree of integers weighted by the depth of each value. You should return the value at the overallRoot plus 2 times the values stored at the next level of the tree plus 3 times the values stored at the next level of the tree plus 4 times the values stored at the next level of the tree and so on. For example, in the tree below:

          +---+
          | 9 |
          +---+
         /     \
     +---+     +---+
     | 7 |     | 6 |
     +---+     +---+
    /     \         \
+---+     +---+     +---+
| 3 |     | 2 |     | 4 |
+---+     +---+     +---+
         /               \
     +---+               +---+
     | 5 |               | 2 |
     +---+               +---+

The sum would be computed as:

1 * 9 + 2 * (7 + 6) + 3 * (3 + 2 + 4) + 4 * (5 + 2) = 90

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}

*/

public int depthSum() {
    int[] sum = new int[1];
    parseTree(overallRoot, 0, sum);
    return sum[0];
}

public void parseTree(IntTreeNode node, int n, int[] sum) {
    if (node == null)
	return;
    n++;
    sum[0] += n * node.data;
    parseTree(node.left, n, sum);
    parseTree(node.right, n, sum);
}
