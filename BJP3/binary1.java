import java.lang.Math;

public class binary1 {
    public static void main(String[] args) {
	int [] nums = {6, 44, 72, 131};
	for (int x: nums) {
	    toBinary(x);
	}
    }

    private static void toBinary(int num) {
	if (num == 0) {
	    System.out.println(0);
	}
	int n = (int)Math.sqrt(num) + 2;
	int[] bb = new int[n];
	while (num != 0) {
	    bb[--n] = num % 2;
	    num /= 2;
	}
	for (int i=n; i<bb.length; i++) {
	    System.out.print(bb[i]);
	}
	System.out.println("");
    }
}
