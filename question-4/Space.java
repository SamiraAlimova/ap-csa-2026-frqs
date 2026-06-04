public int getPointsforRow(int targetRow){
  int sum = 0
  boolean same  = true
  
  for (int c = 0; c < board[targetRow].length; c++){
    sum += board[targetrwow][c].getPoints();
    if (board[targetRow][c].getcolor() != board[targetRow][0].getColor()){
      same = false;
    }

    if (same){
      return sum *2;
    }

    return sum;
}
