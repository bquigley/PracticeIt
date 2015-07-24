/*


Write a method maxOccurrences that accepts a List of integers as a parameter and 
returns the number of times the most frequently occurring integer (the "mode") occurs 
in the list. Solve this problem using a Map as auxiliary storage. If the list is empty, return 0.

*/


public int maxOccurrences(List list) {
    Map cnt_map = new HashMap<Integer, Integer>();
    int max = 0;
    for (int i=0; i<list.size(); i++) {
	Integer x = (Integer) list.get(i);
	int cnt = 1;
	if (cnt_map.containsKey(x)) {
	    cnt = (Integer) cnt_map.get(x) + 1;
	} 
	cnt_map.put(x,cnt);
	if (cnt > max) {
	    max = cnt;
	}
    }
    return max;
}
