/*
  Write a method called percentEven that accepts an array of integers as a parameter and returns the percentage of even numbers in the array as a real number. For example, if the array stores the elements {6, 2, 9, 11, 3}, then your method should return 40.0. If the array contains no even elements or no elements at all, return 0.0. */

public double percentEven(int[] d) {
    if (d.length == 0) {
	return 0.0;
    }
    int n = 0;
    for (int x: d) {
	if (x % 2 == 0)
	    n++;
    }
    return (double) n/d.length * 100;
}
