import java.util.ArrayList;

public class Grid {
    private ArrayList<Subgrid> subgrids = new ArrayList<>();
    private ArrayList<Subgrid> lines = new ArrayList<>();
    private ArrayList<Subgrid> columns = new ArrayList<>();
    private Cell[][] matrix = new Cell[9][9];

    public Grid() {
        // TO DO
    }

    public void changeCellNumber(int subgrid, int line, int column) {
        // TO DO
    }

    public void showGrid() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(this.matrix[i][j].getNumber() + ' ');
            }
            System.out.println();
        }
    }
}