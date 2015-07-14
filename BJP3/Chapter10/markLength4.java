/*


Write a method markLength4 that takes an ArrayList of Strings as a parameter and that places a string of four asterisks "****" in front of every string of length 4. For example, suppose that a variable called list contains the following values: {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"} And you make the following call: markLength4(list); then list should store the following values after the call: {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****", "Java", "programmer"}

Notice that you leave the original strings in the list, "this", "lots", "Java", but include the four-asterisk string in front of each to mark it.
*/

public void markLength4(ArrayList<String> list) {
    for (int i=0; i<list.size(); i++) {
	if (list.get(i).length() == 4) {
	    list.add(i, "****");
	    i++;
	}
    }
}
