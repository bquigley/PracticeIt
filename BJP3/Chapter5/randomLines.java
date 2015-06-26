/*


Write a method called randomLines that prints between 5 and 10 random strings of letters (between "a" and "z"), one per line. Each string should have random length of up to 80 characters.

rlcuhubm
ilons
ahidbxonunonheuxudxrcgdp
xmkmkmmmmwmwqjbaeeeerceheelciheihcreidercdeehiuhhhn
hdcrphdidcrydxgtkdhoendgcidgxfidgfufdgfuuuuuu

(Because this problem uses random numbers, our test cases check only the general format of your output. You must still examine the output yourself to make sure the answer is correct.)
*/

public void randomLines() {
    Random ran= new Random();
    int nl = ran.nextInt(6) + 5;
    int n;
    int pos;
    
    String letters = "abcdefghijklmnopqrstuvwxyz";
    
    for (int i=0; i<nl; i++) {
	n = ran.nextInt(80) + 1;
	for (int j=0; j<n; j++) {
	    pos = ran.nextInt(26);
	    System.out.print(letters.charAt(pos));
	}
	System.out.println();
    }
}

