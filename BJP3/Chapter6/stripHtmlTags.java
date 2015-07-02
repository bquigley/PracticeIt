/*



Write a method called stripHtmlTags that accepts a Scanner representing an input file containing an HTML web page as its parameter, then reads that file and prints the file's text with all HTML tags removed. A tag is any text between the characters < and > . For example, consider the following text:

<html>
<head>
<title>My web page</title>
</head>
<body>
<p>There are many pictures of my cat here,
as well as my <b>very cool</b> blog page,
which contains <font color="red">awesome
stuff about my trip to Vegas.</p>

Here's my cat now:<img src="cat.jpg">
</body>
</html>

If the file contained these lines, your program should output the following text:



My web page


There are many pictures of my cat here,
as well as my very cool blog page,
which contains awesome
stuff about my trip to Vegas.

Here's my cat now:

You may assume that the file is a well-formed HTML document and that there are no < or > characters inside tags.
*/


public void stripHtmlTags(Scanner in) {
    String original_line, line="";
    boolean is_tag = false;
    while (in.hasNextLine()) {
	original_line = in.nextLine();
	for (int i=0; i<original_line.length(); i++) {
	    if (is_tag) {
		if (original_line.charAt(i) == '>') {
		    is_tag = false;
		}
		continue;
	    } else {
		if (original_line.charAt(i) == '<') {
		    is_tag = true;
		    continue;
		} 
	    }
	    line += original_line.charAt(i);
	}
	
	System.out.println(line);
	line="";
    }
}
