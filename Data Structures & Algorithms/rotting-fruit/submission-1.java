class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> queue = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    queue.add(new Pair(0, i, j));
                }
            }
        }
        int currTime =0;
        int r = grid.length;
        int c = grid[0].length;
        int[] surrRow = {0, 0, -1, 1};
        int[] surrCol = {-1, 1, 0, 0};
        while(!queue.isEmpty()){
            Pair currPair = queue.poll();
            currTime = currPair.time;
            int currRow = currPair.row;
            int currCol = currPair.col;
            for(int i=0;i<=3;i++){
                int neiRow = currRow+surrRow[i];
                int neiCol = currCol+surrCol[i];
                if((neiRow>=0 && neiRow<r) && (neiCol>=0 && neiCol<c)&&grid[neiRow][neiCol]==1){
                    grid[neiRow][neiCol]=2;
                    queue.add(new Pair(currTime+1, neiRow, neiCol));
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return currTime;
    }
}
class Pair{
    int time;
    int row;
    int col;
    Pair(int time, int row, int col){
        this.time = time;
        this.row = row;
        this.col = col;
    }
}
