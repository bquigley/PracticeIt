/*
 Write a method printLevel that accepts an integer parameter n and that prints the values at level n from the left to right, one per line. We will use the convention that the overallRoot is at level 1, that its children are at level 2, and so on. For example, if a variable tree stores a reference to the following tree:

            +----+
            | 12 |
            +----+
           /      \
          /        \
      +----+      +----+
      | 19 |      | 93 |
      +----+      +----+
     /      \           \
    /        \           \
+----+      +----+      +----+
| 11 |      | 14 |      | 15 |
+----+      +----+      +----+
           /
          /
      +----+
      | 10 |
      +----+

Then the call tree.printLevel(3); would produce the following output:

11
14
15

If there are no values at the level, your method should produce no output. Your method should throw an IllegalArgumentException if passed a value for a level n that is less than 1.

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}

*/

public void printLevel(int level) {
    if (level <= 0)
	throw new IllegalArgumentException();
    
    parseTree(overallRoot, 1, level);
}

public void parseTree(IntTreeNode node, int currentLevel, int level) {
    if (currentLevel > level)
	return;

    if (node == null)
	return;

    if (currentLevel == level) {
	System.out.println(node.data);
    }
    
    parseTree(node.left, currentLevel+1, level);
    parseTree(node.right, currentLevel+1, level);

}
