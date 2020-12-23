import java.util.*;

public class SquareWithXInsideNumberBox
{
  public static void  main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a positive, odd integer that is greater than or equal to 5");
    int n = input.nextInt();
    
    while (n < 5 || n % 2 == 0) {
      System.out.println("Enter a positive, odd integer that is greater than or equal to 5");
      n = input.nextInt();
    }
    
    int [][] box = new int [n][n];
    
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {
        
        //Diagonals top left to bottom right
        if (row == col) {
          box[row][col] = n;
        }
        //Diagonals top right to bottom left
        if (row + col == n-1) {
          box[row][col] = n;
        }
        //top and bottom borders
        if (row == 0 || row == n-1) {
          box[row][col] = n;
        }
        //left and right borders
        if (col == 0 || col == n-1) {
          box[row][col] = n;
        }
      }
    }
    //printing loop
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {
        //instead of printing out zero's, this just allows the program to print out spaces in the place of the zero's
        if (box[row][col] == 0) {
          System.out.print("\t");
        } else {
          //prints out the 
          System.out.print(box[row][col]+"\t");
        }
      }
      System.out.println("");
    }
  }
}