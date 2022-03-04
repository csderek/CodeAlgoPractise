class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] tower = new double[102][102];
        tower[0][0] = (double) poured;
        
        for(int i = 0; i <= query_row; i++){
            for(int j = 0; j <= i; j++){
                double remain = (tower[i][j] - 1.0) / 2.0;
                
                tower[i+1][j] = tower[i+1][j]  + Math.max(0.0,remain);
                tower[i+1][j+1] = tower[i+1][j+1] + Math.max(0.0,remain);
                
            }
        }
        
        return Math.min(1, tower[query_row][query_glass]);
        
    }
}