/*



Write a method stutter that takes an ArrayList of Strings and an integer k as parameters and that replaces every string with k copies of that string. For example, if the list stores the values ["how", "are", "you?"] before the method is called and k is 4, it should store the values ["how", "how", "how", "how", "are", "are", "are", "are", "you?", "you?", "you?", "you?"] after the method finishes executing. If k is 0 or negative, the list should be empty after the call.

*/

public void stutter(ArrayList<String> list, int k) {
    if (k <= 0) {
	while(list.size() > 0) {
	    list.remove(0);
	}
    } else {
	for (int i=0; i<list.size(); i += k) {
	    for (int j=1; j<k; j++) {
		list.add(i, list.get(i));
	    }
	}
    }
}
