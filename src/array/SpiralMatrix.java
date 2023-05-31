package array;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/spiral-matrix/description/
public class SpiralMatrix {
	
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> out = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int size = m*n, round = 0;
        
        
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[] currD = directions[0];
        int row = 0, col = 0;
        
        
        for(int i = 0; i < size; i++) {
            out.add(matrix[row][col]);
            matrix[row][col] = -200;
            
            if(row+currD[0]>=m || row+currD[0]<0 || col+currD[1]>=n || col+currD[1]<0 || matrix[row+currD[0]][col+currD[1]]==-200) {
                round++;
                currD = directions[round%4];
            }
            
            row += currD[0];
            col += currD[1];
        }
        
        
        return out;
    }

	
	public static void main(String[] args) {
		SpiralMatrix solution = new SpiralMatrix();
		System.out.println("Expected: [1, 2, 3, 6, 9, 8, 7, 4, 5]");
		System.out.println("Result:   " + solution.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
	}

}
