/*


Write a method contains3 that accepts a List of strings as a parameter and returns true if any single string occurs at least 3 times in the list, and false otherwise. Use a map as auxiliary storage.

*/

public boolean contains3(List list) {
    boolean flag = false;
    Map<String, Integer> map = new HashMap<String, Integer>();
    
    for(int i=0; i<list.size(); i++) {
	String s = (String) list.get(i);
	if (map.containsKey(s)) {
	    map.put(s, map.get(s) + 1);
	} else {
	    map.put(s, 1);
	}
    }

    Iterator iter = map.entrySet().iterator();
    while (iter.hasNext()) {
	Map.Entry entry = (Map.Entry) iter.next();
	if ((Integer) entry.getValue() == 3) {
	    flag = true;
	    break;
	}
    }
    return flag;
}
