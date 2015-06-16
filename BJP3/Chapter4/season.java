/*


Write a method named season that takes two integers as parameters representing a month and day and that returns a String indicating the season for that month and day. Assume that months are specified as an integer between 1 and 12 (1 for January, 2 for February, and so on) and that the day of the month is a number between 1 and 31.

If the date falls between 12/16 and 3/15, you should return "Winter". If the date falls between 3/16 and 6/15, you should return "Spring". If the date falls between 6/16 and 9/15, you should return "Summer". And if the date falls between 9/16 and 12/15, you should return "Fall".
*/


public static String season(int month, int day) {
    double time = 1.0* month + 0.01*day;
    String res = "";
    if (time >= 12.16 || time <=3.15) {
	res = "Winter";
    } else if (time >= 3.16 && time <= 6.15) {
	res = "Spring";
    } else if (time >= 6.16 && time <= 9.15) {
	res = "Summer";
    } else if (time >=9.16 && time <= 12.15) {
	res = "Fall";
    }
    return res;
}
