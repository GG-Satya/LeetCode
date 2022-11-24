class Solution {

    public boolean exist(char[][] board, String word) {

        for(int row =0; row<board.length; row++){
             for(int col =0; col< board[row].length; col++){
                // if the first char of the word matches to a char of the board (&&) and we found the whole word using searching method , then return true...
               if(word.charAt(0)== board[row][col] && searchWord(board,row,col,0,word))return true;

            }
        }
        return false; // if don't find the word sequence after checking all cells, then reuturn false'
    }

    private boolean searchWord(char[][] board,int row, int col,int index,String word ){

        // if the index reach at end of the  word
         if( index == word.length()) return true;

        // base condition 
         if( row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index) ) return false;

        char temp = board[row][col]; //storing current char in a temp var

        board[row][col] = '*'; // mark the char as * so that we will not confuse while searching  for remaining adjacent char
        // finding in all direction and returning a boolean result
        boolean found = searchWord(board, row+1, col, index+1, word) ||
        searchWord(board, row-1, col, index+1, word) ||
        searchWord(board, row, col+1, index+1, word) ||
        searchWord(board, row, col-1, index+1, word);
        
        board[row][col] = temp;// assign back to its original value 

        return found; //return the search result
    }
}
