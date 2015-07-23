/*


Write a method intersect that takes two Maps of strings to integers as parameters and that returns a new map whose contents are the intersection of the two. The intersection of two maps is defined here as the set of keys and values that exist in both maps. So if some key K maps to value V in both the first and second map, include it in your result. If K does not exist as a key in both maps, or if K does not map to the same value V in both maps, exclude that pair from your result. For example, consider the following two maps:

{Janet=87, Logan=62, Whitaker=46, Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95}
{Logan=62, Kim=52, Whitaker=52, Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87}

Calling your method on the preceding maps would return the following new map (the order of the key/value pairs does not matter):

{Logan=62, Stefanie=80, Jeff=88, Kim=52}

*/

public Map intersect(Map map1, Map map2) {
    Map res = new HashMap<String, Integer>();
        
    Iterator iter = map1.entrySet().iterator();
    while(iter.hasNext()) {
	Map.Entry entry = (Map.Entry) iter.next();
	String K1 = (String) entry.getKey();
	Integer V1 = (Integer) entry.getValue();
	
	Iterator iter2 = map2.entrySet().iterator();
	while(iter2.hasNext()) {
	    Map.Entry entry2 = (Map.Entry) iter2.next();
	    String K2 = (String) entry2.getKey();
	    Integer V2 = (Integer) entry2.getValue();
	    if (K1.equals(K2) && V1 == V2) {
		res.put(K1, V1);
	    }
	}
	
    }
    return res;
}

