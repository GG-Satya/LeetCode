class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> s = new HashSet<>(); // taking Set to store unique String values

        for(int i= 0; i<9; i++){

            for(int j=0; j<9; j++){

                int num = board[i][j];

                // if it is not blank
                if(num != '.'){
                    // trying to add this num to set with row , col and block name to maintain uniquness
                    // if already added in same row or col or 3x3 box, then return false
                    if(!s.add(num+"in row"+i) || 
                        !s.add(num+"in col"+j) || 
                        !s.add(num+"in block"+ (i/3) +","+ (j/3)) ) return false;
                }
            }
        }
        // if no duplicate value found in row or column or 3*3 box then it is perfect, so return true
        return true;
    }

}

/*--------feel free to ask me any if don't get any step------------*/