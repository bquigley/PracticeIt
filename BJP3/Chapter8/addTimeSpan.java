/*
 Add the following method to the TimeSpan class:

public void add(TimeSpan span)

Adds the given amount of time to this time span.

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

public void add(TimeSpan span) {
	hours += span.getHours();
	minutes += span.getMinutes();

	hours += minutes/60;
	minutes -= minutes/60 * 60;
}