/*

 Add the following method to the TimeSpan class:

public void scale(int factor)

Scales this time span by the given factor. For example, 1 hour and 45 minutes scaled by 2 equals 3 hours and 30 minutes.

Recall the TimeSpan code from this chapter:

public class TimeSpan {
    private int hours;
    private int minutes;
    
    public void add(int hours, int minutes) { ... }
    public int getHours() { ... }
    public int getMinutes() { ... }
    public String toString() { ... }

    // your code goes here
    
}
*/

public void scale(int factor) {
	hours *= factor;
	minutes *= factor;
	hours += minutes/60;
	minutes -= minutes/60 * 60;
}
