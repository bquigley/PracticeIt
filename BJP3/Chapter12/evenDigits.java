/*


Write a method evenDigits that accepts an integer parameter n and that returns the integer formed by removing the odd digits from n. The following table shows several calls and their expected return values:
Call 	Valued Returned
evenDigits(8342116); 	8426
evenDigits(4109); 	40
evenDigits(8); 	8
evenDigits(-34512); 	-42
evenDigits(-163505); 	-60
evenDigits(3052); 	2
evenDigits(7010496); 	46
evenDigits(35179); 	0
evenDigits(5307); 	0
evenDigits(7); 	0

If a negative number with even digits other than 0 is passed to the method, the result should also be negative, as shown above when -34512 is passed. Leading zeros in the result should be ignored and if there are no even digits other than 0 in the number, the method should return 0, as shown in the last three outputs.
*/

public int evenDigits(int n) {
    int pn = 1;
    if (n < 0)
	pn = -1;
    n = Math.abs(n);
    
    if (n == 0)
	return 0;
    
    int x = n % 10;
    if (x % 2 == 1) 
	return pn * evenDigits(n/10);
    
    return pn * (evenDigits(n/10)* 10 + x);
}
