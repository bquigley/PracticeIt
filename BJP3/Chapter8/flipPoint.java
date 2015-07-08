/*


Add the following method to the Point class:

public void flip()

Negates and swaps the x/y coordinates of the Point object. For example, if the object initially represents the point (5, -3), after a call to flip, the object should represent (3, -5). If the object initially represents the point (4, 17), after a call to flip, the object should represent (-17, -4).

public class Point {
    private int x;
    private int y;
    
    // your code goes here
    
}

*/

public void flip() {
    int tmp = y;
    y = -1 * x;
    x = -1 * tmp;
}
