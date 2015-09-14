/*
 Write a method equals that could be added to the IntTree class. (On your handout this method is called "equals", but Practice-It needs to use the name "equals" for another purpose, so we'll call it "equals2" here.) The method accepts another binary tree of integers as a parameter and compares the two trees to see if they are equal to each other. For example, if variables of type IntTree called t1 and t2 have been initialized, then the call of t1.equals2(t2) will return true if the trees are equal and false if otherwise.

Two trees are considered equal if they have exactly the same structure and store the same values. Each node in one tree must have a corresponding node in the other tree in the same location relative to the root and storing the same value. Two empty trees are considered equal to each other.

You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class nor create any data structures such as arrays, lists, etc. Your method should not change the structure or contents of either of the two trees being compared.

Assume that you are adding this method to the IntTree class as defined below:

public class IntTree {
    private IntTreeNode overallRoot;
    ...
}
*/

public boolean equals2(IntTree tree2){
    return _equals(this.overallRoot, tree2.overallRoot);    
}

private boolean _equals(IntTreeNode node1, IntTreeNode node2) {
    if (node1 == null && node2 == null)
	return true;
    if (node1 == null || node2 == null)
	return false;
    if (node1.data != node2.data)
	return false;
    return _equals(node1.left, node2.left) && _equals(node1.right, node2.right);
}
