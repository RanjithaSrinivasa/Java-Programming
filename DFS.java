class Solution {
    public void solve(char[][] board) {
        
        //gives number of rows
        int row = board.length;
        
        //if number of rows <= 2, then no need to change anything
        if(row <= 2) return;
        
        //number of columns
        int column = board[0].length;
        
        //if number of columns <= 2, then no need to change anything
        //if you do not put this check, array out of bounds when it is empty array
        if(column <= 2) return;
        
        //check for border elements with 'O', then apply dfs on them
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(i == 0 || j == 0 || i == row - 1 || j == column - 1){
                    if(board[i][j] == 'O'){
                        dfs(board, i , j);                       
                    }
                }
            }
        }
    
    //now demark the elements with value 'A', which leaves the inner elements
    //with 'O' as it is which could be chenaged to 'X'
    for(int i = 0; i < row; i++){
        for(int j = 0; j < column; j++){
            
            //marking back the border and it's neighbors to 'O'
            if(board[i][j] == 'A'){
                board[i][j] = 'O';
            } 
            //changing the untouched elements with 'O' to 'X'
            else if(board[i][j] == 'O'){
                board[i][j] = 'X';
            }
            
        }
    }

    }
    
    //dfs algo to check the neighbors of border elem with 'O' value and see if they
    //are connected and mark them 'A'.
    public void dfs(char[][] board, int row, int col){
      int r = board.length;
      int c = board[0].length;
      if(row >= 0 && col >= 0 && row < r && col < c && board[row][col] == 'O'){
          //marking the border element 'A'
          board[row][col] = 'A';
          
          //applying dfs on neighbors
          dfs(board, row+1, col);
          dfs(board, row, col+1);
          
          //check if row is 0, then doing 0-1 would be pointless
          if(row > 0)
            dfs(board, row-1, col);
          
          
          if(col > 0)
            dfs(board, row, col-1);
      }  
    }
}