/*
Write a method hasOdd that takes a Set of integers as a parameter and that returns true if the set contains at least one odd integer, and false otherwise. If passed the empty set, your method should return false. 

 */


public boolean hasOdd(Set set) {
    boolean flag = false;
    Iterator iter = set.iterator();
    while (iter.hasNext()) {
	Integer x = (Integer) iter.next();
	if (x % 2 == 1) {
	    flag = true;
	    break;
	}
    }
    return flag;
}
