class Solution {

    private boolean findWord(char[][] board,int r,int c,int i,int j,String word,int index){
        // base condition - if index is > word, we found the word
        if(index >= word.length())return true;
        // base case - edge case scenarios
        if(i<0 || j <0 || i>=r || j>=c || board[i][j] != word.charAt(index))return false;

        // storing char at index i,j in temp such that we do not revisit this
        char ch = board[i][j];
        board[i][j] = '*';
        // making 4 recurssive calls to search word in left,right,up and down.
        boolean up = findWord(board,r,c,i-1,j,word,index+1);
        boolean down = findWord(board,r,c,i+1,j,word,index+1);
        boolean left = findWord(board,r,c,i,j-1,word,index+1);
        boolean right = findWord(board,r,c,i,j+1,word,index+1);

        if(up == false && down == false && left == false && right == false){
            board[i][j] = ch; // giving default value back for other computation
            return false;
        }
        return true; 

    }

    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;

        for(int i = 0 ; i < r ;i++){
            for(int j = 0 ; j < c ;j++){
                boolean isPresent = findWord(board,r,c,i,j,word,0);
                if(isPresent == true)return true;
            }
        }
        return false;
    }
}