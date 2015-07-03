/*
  Write a method called isMagicSquare that accepts a two-dimensional array of integers as a parameter and returns true if it is a magic square. A square matrix is a magic square if it is square in shape (same number of rows as columns, and every row the same length), and all of its row, column, and diagonal sums are equal. For example, [[2, 7, 6], [9, 5, 1], [4, 3, 8]] is a magic square because all eight of the sums are exactly 15. */


public boolean isMagicSquare(int[][] dd) {
    int r = dd.length;
    int sum = 0;
    for (int i=0; i<r ; i++) {
	sum += dd[0][i];
	if (dd[i].length != r) {
	    return false;
	}
    }

    int sum2 = 0;
    // column sum
    for (int i=0; i<r;i++) {
	for (int j=0; j<r; j++) {
	    sum2 += dd[i][j];
	}
	if (sum2 != sum)
	    return false;
	sum2 = 0;
    }
    // row sum
    for (int j=0; j<r; j++) {
	for (int i=0; i<r; i++) {	    
	    sum2 += dd[i][j];
	}
	if (sum2 != sum)
	    return false;
	sum2 = 0;
    }
    // diagram
    int sum3 = 0;
    for (int i=0; i<r; i++) {
	sum2 += dd[i][i];
	sum3 += dd[i][r-i-1];
    }
    if (sum2 != sum)
	return false;
    if (sum3 != sum)
	return false;
    
    return true;
}
