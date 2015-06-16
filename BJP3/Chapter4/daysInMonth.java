/*
 Write a method named daysInMonth that accepts a month (an integer between 1 and 12) as a parameter and returns the number of days in that month in this year. For example, the call daysInMonth(9) would return 30 because September has 30 days. Assume that the code is not being run during a leap year (that February always has 28 days).
Month 	1 Jan 	2 Feb 	3 Mar 	4 Apr 	5 May 	6 Jun 	7 Jul 	8 Aug 	9 Sep 	10 Oct 	11 Nov 	12 Dec
Days 	31 	28 	31 	30 	31 	30 	31 	31 	30 	31 	30 	31
*/

public static int daysInMonth(int month) {
    if (month == 2) {
	return 28;
    } else if (month == 4 ||
	       month == 6 ||
	       month == 9 ||
	       month == 11) {
	return 30;
    } else {
	return 31;
    }
}
