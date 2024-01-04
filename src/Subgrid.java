public class Subgrid {
    // will work both as a subgrid, as a line or as a column
    private boolean[] numbers = new boolean[9];
    private int countOnNumbers = 0;

    public void setOnNumber(int num) {
        this.numbers[num-1] = true;
        this.countOnNumbers++;
    }
}