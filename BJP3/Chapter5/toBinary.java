/*


Write a method named toBinary that accepts an integer as a parameter and returns a string of that number's representation in binary. For example, the call of toBinary(42) should return "101010".

*/


// also see: https://github.com/GuangchuangYu/PracticeIt/blob/master/BJP3/Chapter1/binary1.java

public String toBinary(int num) {
    if (num == 0) {
	return "0";
    }
    String res="";
    while (num != 0) {
	res = num % 2 + res;
	num /= 2;
    }
    return res;
}
