package boardgame;

public class Position {
    
    private Integer row;
    private Integer column;
    
    // CONSTRUCTORS

    public Position(){}

    public Position(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    // GET and SET

    public Integer getRow() {
        return row;
    }
    public void setRow(Integer row) {
        this.row = row;
    }
    public Integer getColumn() {
        return column;
    }
    public void setColumn(Integer column) {
        this.column = column;
    }    

    // METHODS

    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString(){
        return row + ", " + column;
    }
    
}
