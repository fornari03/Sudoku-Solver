import java.util.ArrayList;

public class Grid {
    private ArrayList<Subgrid> subgrids = new ArrayList<>();
    private ArrayList<Subgrid> rows = new ArrayList<>();
    private ArrayList<Subgrid> columns = new ArrayList<>();
    private Cell[][] matrix = new Cell[9][9];

    public Grid(int[][] m) {
        // TO DO
        for (int i = 0; i < 9; i++) {
            subgrids.add(new Subgrid());
            rows.add(new Subgrid());
            columns.add(new Subgrid());
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.matrix[i][j] = new Cell(m[i][j], subgrids.get(i/3*3 + j/3), this.rows.get(i), this.columns.get(j));
                if (m[i][j] != 0) {
                    this.matrix[i][j].getSubgrid().setOnNumber(m[i][j]);
                    this.matrix[i][j].getRow().setOnNumber(m[i][j]);
                    this.matrix[i][j].getColumn().setOnNumber(m[i][j]);
                }
            }
        }
    }

    public void showGrid() {
        System.out.println("\nVisualization of the grid:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(this.matrix[i][j].getNumber() + " ");
            }
            System.out.println();
        }
    }
}