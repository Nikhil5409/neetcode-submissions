class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length; 
        boolean[][] visited = new boolean[r][c];
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    bfs(grid, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    void bfs(char[][] grid, boolean[][] visited, int row, int col){
        int r=grid.length;
        int c= grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(row, col));
        while(!queue.isEmpty()){
            Pair currPair = queue.poll();
            int currRow = currPair.row;
            int currCol = currPair.col;
            visited[currRow][currCol]=true;
            int[] surrRow ={0, 0, -1, 1};
            int[] surrCol ={-1, 1, 0, 0};
            for(int i=0;i<=3;i++){
                int newRow = currRow+surrRow[i];
                int newCol = currCol+surrCol[i];
                if((newRow>=0 && newRow<r) && (newCol>=0 && newCol<c)
                &&!visited[newRow][newCol]&&grid[newRow][newCol]=='1'){
                    visited[newRow][newCol]=true;
                    queue.add(new Pair(newRow, newCol));
                }
            }
        }
    }
}
class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}
