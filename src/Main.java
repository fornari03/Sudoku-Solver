import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Enter the grid of the sudoku 9x9 problem:");
        Scanner input = new Scanner(System.in);
        
        int[][] matrix = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        input.close();

        Grid sudokuGrid = new Grid(matrix);
        sudokuGrid.showGrid();
        System.out.println("Test");
    }
}