/*

Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes all of the strings of even length from the list. 

*/

public void removeEvenLength(ArrayList<String> x) {
    for (int i=0; i<x.size(); i++) {
	if (x.get(i).length() % 2 == 0) {
	    x.remove(i);
	    i--;
	}
    }
}
