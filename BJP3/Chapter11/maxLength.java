/*

Write a method maxLength that takes a Set of strings as a parameter and that returns the length of the longest string in the set. If your method is passed an empty set, it should return 0.
*/

public int maxLength(Set x) {
    int max = 0;
    Iterator iter = x.iterator();
    while(iter.hasNext()) {
	String entry = (String) iter.next();
	if (entry.length() > max) {
	    max = entry.length();
	}
    }
    return max;
}
