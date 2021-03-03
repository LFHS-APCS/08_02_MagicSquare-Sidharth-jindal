
/**
 * @author 
 * @version 
 */

public class MagicSquare
{
    /** The magic square array data */
    private int[][] array;

    /**
     * Constructs a MagicSquare object.
     * @param input the magic square array data.
     */
    public MagicSquare(int[][] input)
    {
        array = input;
    }

    /**
     * Tests to see if array is indeed a magic square
     * @return true if array is a magic square
     * @return false if the array is not a magic square
     */
    public boolean isMagicSquare()
    {
      int numtimesnotsquare = 0;
      int numcol = 0;
      for(int row = 0; row<array.length; row++){
        for(int col = 0; col<array[row].length; col++){
          numcol++;
        }
      }
      if(numcol/array.length != array.length){
        return false;
      }else{
        //I WAS GOING TO PUT THE METHOD HERE BUT IT ISN'T WORKING FOR SOME REASON
        int numtestsfailed = 0;
        //find the sum of the first column to set as benchmark
        int totalsum = 0;
        for(int row = 0; row<array.length; row++){
          totalsum = array[row][0] + totalsum;
        }
        //test to see if the rows add up to the same number
        for(int row = 0; row<array.length; row++){
          int rowsum = 0;
          for(int col = 0; col<array[row].length; col++){
           rowsum = rowsum + array[row][col];
          }
          if(rowsum != totalsum){
            numtestsfailed++;
          }
        }
        //test to see if the columns add up to the same number
        for(int col = 0; col<array.length; col++){
          int colsum = 0;
          for(int row = 0; row<array.length; row++){
            colsum = colsum + array[row][col];
          }
          if(colsum != totalsum){
            numtestsfailed++;
          }
        }
        //test to see if the diagonal going right adds up to the same number
        int rightdiagonalsum = 0;
        for(int row = 0; row<array.length; row++){
          rightdiagonalsum = rightdiagonalsum + array[row][row];
        }
        if(rightdiagonalsum != totalsum){
          numtestsfailed++;
        }
        //test to see if the diagonal going left adds up to the same number
        int leftdiagonalsum = 0;
        for(int row = 0; row<array.length; row++){
          leftdiagonalsum = leftdiagonalsum + array[row][array.length-row-1];
        }
        if(leftdiagonalsum != totalsum){
          numtestsfailed++;
        }
        //tests failed
        if(numtestsfailed > 0){
          return false;
        }else{
          return true;
        }
      }
    }

    /*
    Method that returns a true or false value after it has been deduced whether or not the matrix is a square.
    */

    public boolean isMagicSquarebutSquare(){
      int numtestsfailed = 0;
      //find the sum of the first column to set as benchmark
      int totalsum = 0;
      for(int row = 0; row<array.length; row++){
        totalsum = array[row][0] + totalsum;
      }
      //test to see if the rows add up to the same number
      for(int row = 0; row<array.length; row++){
        int rowsum = 0;
        for(int col = 0; col<array[row].length; col++){
          rowsum = rowsum + array[row][col];
        }
        if(rowsum != totalsum){
          numtestsfailed++;
        }
      }
      //test to see if the columns add up to the same number
      for(int col = 0; col<array.length; col++){
        int colsum = 0;
        for(int row = 0; row<array.length; row++){
          colsum = colsum + array[row][col];
        }
        if(colsum != totalsum){
          numtestsfailed++;
        }
      }
      //test to see if the diagonal going right adds up to the same number
      int rightdiagonalsum = 0;
      for(int row = 0; row<array.length; row++){
        rightdiagonalsum = rightdiagonalsum + array[row][row];
      }
      if(rightdiagonalsum != totalsum){
        numtestsfailed++;
      }
      //test to see if the diagonal going left adds up to the same number
      int leftdiagonalsum = 0;
      for(int row = 0; row<array.length; row++){
        leftdiagonalsum = leftdiagonalsum + array[row][array.length-row-1];
      }
      if(leftdiagonalsum != totalsum){
        numtestsfailed++;
      }

      //tests failed
      if(numtestsfailed > 0){
        return false;
      }else{
        return true;
      }
    }

    /**
     * Returns a String which represents the array.
     */
    public String toString()
    {
        String result = "";
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                result += array[r][c];
                result += "\t";
            }
            result += "\n";
        }
        return result;
    }
}
