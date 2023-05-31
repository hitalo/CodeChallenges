package array;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-image/description/
public class RotateImage {
	
	public void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
    }
    
    public void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }
    
    
    //after transpose, the columns are inversed, so we reflect
    public void reflect(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
    }

	public static void main(String[] args) {
		RotateImage solution = new RotateImage();
		int[][] matrix = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		solution.rotate(matrix);
		
		
		System.out.println("Expected: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]");
		System.out.println("Result:   " + Arrays.deepToString(matrix).replaceAll(" ", ""));
	}

}
