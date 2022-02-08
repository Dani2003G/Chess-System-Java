package boardgame;

public class Position {
    
    private Integer row;
    private Integer colum;
    
    // CONSTRUCTORS

    public Position(){}

    public Position(Integer row, Integer colum) {
        this.row = row;
        this.colum = colum;
    }

    // GET and SET

    public Integer getRow() {
        return row;
    }
    public void setRow(Integer row) {
        this.row = row;
    }
    public Integer getColum() {
        return colum;
    }
    public void setColum(Integer colum) {
        this.colum = colum;
    }    

    // METHODS

    @Override
    public String toString(){
        return row + ", " + colum;
    }
    
}
