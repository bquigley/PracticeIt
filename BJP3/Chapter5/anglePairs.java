/*
 Write a static method named anglePairs that accepts three angles (integers), measured in degrees, as parameters and returns whether or not there exists both complementary and supplementary angles amongst the three angles passed. Two angles are complementary if their sum is exactly 90 degrees; two angles are supplementary if their sum is exactly 180 degrees. Therefore, the method should return true if any two of the three angles add up to 90 degrees and also any two of the three angles add up to 180 degrees; otherwise the method should return false. You may assume that each angle passed is non-negative.

Here are some example calls to the method and their resulting return values.
Call 	Value Returned

anglePairs(0, 90, 180)
anglePairs(45, 135, 45)
anglePairs(177, 87, 3)
anglePairs(120, 60, 30)
anglePairs(35, 60, 30)
anglePairs(120, 60, 45)
anglePairs(45, 90, 45)
anglePairs(180, 45, 45)

	

true
true
true
true
false
false
false
false

 */


public boolean anglePairs(int x, int y, int z) {
    int[] angle = {x, y, z};
    int sum=0;
    boolean is_complementary = false;
    boolean is_supplementary = false;
    for (int i=0; i<2; i++) {
	for (int j=i+1; j<3; j++) {
	    sum = angle[i] + angle[j];
	    if (sum == 90) {
		is_complementary = true;
	    } else if (sum == 180) {
		is_supplementary = true;
	    }
	    if (is_complementary && is_supplementary)
		return true;
	}
    }
    return false;
}
