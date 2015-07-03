/*
  Write a method called append that accepts two integer arrays as parameters and returns a new array that contains the result of appending the second array's values at the end of the first array. For example, if arrays list1 and list2 store {2, 4, 6} and {1, 2, 3, 4, 5} respectively, the call of append(list1, list2) should return a new array containing {2, 4, 6, 1, 2, 3, 4, 5}. If the call instead had been append(list2, list1), the method would return an array containing {1, 2, 3, 4, 5, 2, 4, 6}. */

public int[] append(int[] list1, int[] list2) {
    int n1 = list1.length;
    int n2 = list2.length;
    int[] d = new int[n1+n2];
    for (int i=0; i<n1; i++) {
	d[i] = list1[i];
    }
    for (int i=0; i<n2; i++) {
	d[n1+i] = list2[i];
    }

    return d;
}
