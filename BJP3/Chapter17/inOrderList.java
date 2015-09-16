/*
 Write a method inOrderList that could be added to the IntTree class. The method returns a list containing the sequence of values obtained from an in-order traversal of your binary tree of integers. For example, if a variable tree refers to the following tree:

              +---+
              | 7 |
              +---+
             /     \
         +---+     +---+
         | 4 |     | 2 |
         +---+     +---+
        /         /     \
    +---+     +---+     +---+
    | 9 |     | 5 |     | 0 |
    +---+     +---+     +---+

Then the call tree.inOrderList() should return the following list:

[9, 4, 7, 5, 2, 0]

If the tree is empty, your method should return an empty list.

You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class nor create any data structures such as arrays, etc. other than the list you will eventually return. Your method should not change the structure or contents of the tree.

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}
*/

public List inOrderList() {
    List res = new ArrayList<Integer>();
    inOrderList(overallRoot, res);
    return res;
}

private void inOrderList(IntTreeNode node, List content) {
    if (node == null)
	return;
    inOrderList(node.left, content);
    content.add(node.data);
    inOrderList(node.right, content);
}
