/*
 Write a method evenLevels that could be added to the IntTree class from lecture and section. The method should make sure that all branches end on an even level. If a leaf node is on an odd level it should be removed from the tree. We will define the root as being on level 1.

The following table shows the results of a call of your method on a particular tree:
before 	after

                  +----+
                  | 67 |
                  +----+
               /          \
            /                \
       +----+                +----+
       | 80 |                | 52 |
       +----+                +----+
      /      \              /      \
     /        \            /        \
 +----+     +----+      +----+    +----+
 | 16 |     | 21 |      | 99 |    | 12 |
 +----+     +----+      +----+    +----+
             /  \           \
            /    \           \
        +----+  +----+      +----+
        | 45 |  | 33 |      | 67 |
        +----+  +----+      +----+
                    \
                     \
                     +----+
                     | 22 |
                     +----+

	

                  +----+
                  | 67 |
                  +----+
               /          \
            /                \
       +----+                +----+
       | 80 |                | 52 |
       +----+                +----+
             \               /      
              \             /        
            +----+      +----+    
            | 21 |      | 99 |    
            +----+      +----+    
             /  \           \
            /    \           \
        +----+  +----+      +----+
        | 45 |  | 33 |      | 67 |
        +----+  +----+      +----+

You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the tree class nor create any data structures such as arrays, lists, etc. You should not construct any new node objects or change the data of any nodes. For full credit, your solution must be recursive and properly utilize the x = change(x) pattern.

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}

*/

public void evenLevels() {
    overallRoot = _evenLevels(overallRoot, 1);
}

private IntTreeNode _evenLevels(IntTreeNode node, int currentLevel) {
    if (node == null)
	return null;
    
    if (currentLevel % 2 == 1 && !hasChild(node)) {
	return null;
    } else {
	node.left = _evenLevels(node.left, currentLevel + 1);
	node.right = _evenLevels(node.right, currentLevel + 1);
    }
    return node;
}



private boolean hasChild(IntTreeNode node) {
    if (node.left == null && node.right == null)
	return false;
    return true;
}
