/*


Add the following method to the Point class:

public int quadrant()

Returns which quadrant of the x/y plane this Point object falls in. Quadrant 1 contains all points whose x and y values are both positive. Quadrant 2 contains all points with negative x but positive y. Quadrant 3 contains all points with negative x and y values. Quadrant 4 contains all points with positive x but negative y. If the point lies directly on the x and/or y axis, return 0.

public class Point {
    private int x;
    private int y;
    
    // your code goes here
    
}

*/

public int quadrant() {
    if (x > 0 & y > 0)
	return 1;
    if (x > 0 & y < 0)
	return 4;
    if (x < 0 & y > 0)
	return 2;
    if (x < 0 & y < 0)
	return 3;
    
    return 0;
}    

