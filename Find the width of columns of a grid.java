class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] result = new int[cols];
        for(int i=0 ; i<cols ; i++){
            int max = 0;
            for(int j=0 ; j<rows ; j++){
                int width = 0;
                if(grid[j][i] < 0){
                    width = len(grid[j][i]) + 1;
                }
                else{
                    width = len(grid[j][i]);
                }
                
                max = Math.max(max,width);
            }
            result[i] = max;
        }
        return result;
    }
    
    public int len(int n){
        int length = 0;
        if (n == 0) {
            length = 1;
        }  
while(n != 0)  
{  
n = n / 10;  
length = length + 1;  
}  
return length;  

    }
}
