public class Cell {
    private int number;
    private Subgrid subgrid;
    private Subgrid row;
    private Subgrid column;

    public Cell(int number, Subgrid subgrid, Subgrid row, Subgrid column) {
        this.number = number;
        this.subgrid = subgrid;
        this.row = row;
        this.column = column;
    }
    
    public int getNumber() {
        return this.number;
    }

    public Subgrid getSubgrid() {
        return this.subgrid;
    }

    public Subgrid getRow() {
        return this.row;
    }

    public Subgrid getColumn() {
        return this.column;
    }
}