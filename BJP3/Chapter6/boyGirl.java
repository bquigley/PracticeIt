/*


Write a method named boyGirl that accepts a Scanner as a parameter. The Scanner is reading its input from a file containing a series of names followed by integers. The names alternate between boys' names and girls' names. Your method should compute the absolute difference between the sum of the boys' integers and the sum of the girls' integers. The input could end with either a boy or girl; you may not assume that it contains an even number of names. If the input file tas.txt contains the following text:

Steve 3 Sylvia 7 Craig 14 Lisa 13 Brian 4 Charlotte 9 Jordan 6

then your method could be called in the following way:

Scanner input = new Scanner(new File("tas.txt"));
boyGirl(input);

and should produce the following output, since the boys' sum is 27 and the girls' sum is 29:

4 boys, 3 girls
Difference between boys' and girls' sums: 2

*/

public void boyGirl(Scanner file) {
    int[] cnt = new int[2];
    int[] n = new int[2];
    int pos = 0;
    while (file.hasNext()) {
	if (file.hasNextInt()) {
	    cnt[pos]++;
	    n[pos] += file.nextInt();
	    if (pos == 0) {
		pos = 1;
	    } else {
		pos = 0;
	    }
	} else {
	    file.next(); // throw name;
	}
    }
    System.out.println(cnt[0] + " boys, " + cnt[1] + " girls");
    System.out.println("Difference between boys' and girls' sums: " + Math.abs(n[1] - n[0]));
}
