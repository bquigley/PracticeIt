/*


Write a method isUnique that accepts a Map from strings to strings as a parameter and returns true if no two keys map to the same value (and false if any two or more keys do map to the same value). For example, calling your method on the following map would return true:

{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}

Calling it on the following map would return false, because of two mappings for Perkins and Reges:

{Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}

The empty map is considered to be unique, so your method should return true if passed an empty map.

*/

public boolean isUnique(Map map) {
    Map value_count = new HashMap<String, Integer>();

    boolean flag = true;
    
    Iterator iter = map.entrySet().iterator();
    while(iter.hasNext()) {
	Map.Entry entry = (Map.Entry) iter.next();
	String value = (String) entry.getValue();
	if (value_count.containsKey(value)) {
	    flag = false;
	    break;
	} else {
	    value_count.put(value, 1);
	}
    }
    return flag;
}
