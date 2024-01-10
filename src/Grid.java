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

    public void solve() {
        while (true) { // change to while (countZeros > 0)
            boolean change = false;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (this.matrix[i][j].getNumber() == 0) {
                        boolean[] possible = new boolean[9];
                        int cont = 0;
                        int index = 0;
                        for (int k = 0; k < 9; k++) {
                            possible[k] = this.matrix[i][j].getSubgrid().getNumbers()[k] || this.matrix[i][j].getRow().getNumbers()[k] || this.matrix[i][j].getColumn().getNumbers()[k];
                            if (possible[k])
                                cont++;
                            else
                                index = k;
                        }
                        if (cont == 8) {
                            this.matrix[i][j].setNumber(index+1);
                            change = true;
                        }
                    }
                }
            }

            if (!change)
                break;
        }
    }
}