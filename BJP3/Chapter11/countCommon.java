/*


Write a method countCommon that takes two Lists of integers as parameters and returns the number of unique integers that occur in both lists. Use one or more Sets as storage to help you solve this problem.

For example, if one list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] and the other list contains the values [-5, 15, 2, -1, 7, 15, 36], your method should return 4 (because the elements -1, 2, 7, and 15 occur in both lists).

*/

public int countCommon(List list1, List list2) {
    Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

    for (int i=0; i<list1.size(); i++) {
	Integer key = (Integer) list1.get(i);
	countMap.put(key, 1);
    }

    for (int i=0; i<list2.size(); i++) {
	Integer key = (Integer) list2.get(i);
	
	if (countMap.containsKey(key)) {
	    countMap.put(key, 2);
	} else {
	    countMap.put(key, 1);
	}
    }

    int cnt = 0;
    Iterator it = countMap.entrySet().iterator();
    while(it.hasNext()) {
    	Map.Entry pair = (Map.Entry) it.next();
    	if ( (Integer) pair.getValue() == 2) {
    	    cnt++;
    	}
    }
   
    return cnt;
}
