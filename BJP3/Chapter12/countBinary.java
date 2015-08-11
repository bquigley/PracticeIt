/*


Write a method countBinary that accepts an integer n as a parameter and that prints all binary numbers that have n digits in ascending order, printing each value on a separate line. All n digits should be shown for all numbers, including leading zeros if necessary. You may assume that n is non-negative. If n is 0, a blank line of output should be produced. Do not use a loop in your solution; implement it recursively.
Call 	Output

countBinary(1);

	

0
1

countBinary(2);

	

00
01
10
11

countBinary(3);

	

000
001
010
011
100
101
110
111

Hint: It may help to define a private helper method that accepts different parameters than the original method. In particular, consider building up a set of characters as a String for eventual printing.

*/




public void countBinary(int n) {
    String num = "";
    countBinary(n, num);
}

public void countBinary(int n, String num) {
    if(n == 0) {
        System.out.println(num);
        return;
    }
    
    countBinary(n - 1, num + "0");
    countBinary(n - 1, num + "1");
}
