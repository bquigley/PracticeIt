/* Add the following method to the TimeSpan class:

public void subtract(TimeSpan span)

Subtracts the given amount of time from this time span. (You do not need to worry about the case of a negative result.)

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

public void subtract(TimeSpan span) {
	hours -= span.getHours();
	minutes -= span.getMinutes();
	if (minutes < 0) {
		minutes += 60;
		hours --;
	}
}
