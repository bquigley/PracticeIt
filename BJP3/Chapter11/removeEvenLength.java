/*


Write a method removeEvenLength that takes a Set of strings as a parameter and that removes all of the strings of even length from the set. For example, if your method is passed a set containing the following elements:

["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]

Your method should modify the set to store the following elements (the order of the elements does not matter):

["foo", "bar", "spoon", "!"]

*/

public void removeEvenLength(Set set) {
    Iterator iter = set.iterator();
    while(iter.hasNext()) {
	String s = (String) iter.next();
	if (s.length() % 2 == 0) {
	    iter.remove();
	}
    }
}
