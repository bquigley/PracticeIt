/*
  Write a method named matrixAdd that accepts a pair of two-dimensional arrays of integers as parameters, treats the arrays as 2D matrices and adds them, returning the result. The sum of two matrices A and B is a matrix C where for every row i and column j, Cij = Aij + Bij. You may assume that the arrays passed as parameters have the same dimensions. */

public int[][] matrixAdd(int[][] A, int[][] B) {
    int r = A.length;
    if (r == 0) {
	return A; // A is {}, then result will be {}
    }
    int c = A[0].length;
    int[][] C = new int[r][c];

    for (int i=0; i<r; i++) {
	for (int j=0; j<c; j++) {
	    C[i][j] = A[i][j] + B[i][j];
	}
    }
    return C;
}
