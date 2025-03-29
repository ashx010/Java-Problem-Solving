import java.util.*;

class TransposeMatrix {
    public int[][] transposeMatrix(int[][] matrix) {
        // Write your code here.
        int w=matrix.length, h=matrix[0].length;
        int[][] ans = new int[h][w];
        for(int i=0; i<w; i++){
            for(int j=0; j<h; j++){
                ans[j][i] =  matrix[i][j];
            }
        }
        return ans;
    }
}
