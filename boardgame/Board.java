package boardgame;

public class Board {

    private Integer rows;
    private Integer colums;
    private Piece[][] pieces;
    
    // CONSTRUCTORS

    public Board(){}
    
    public Board(Integer rows, Integer colums) {
        this.rows = rows;
        this.colums = colums;
        pieces = new Piece[rows][colums];
    }

    // GET and SET

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColums() {
        return colums;
    }

    public void setColums(Integer colums) {
        this.colums = colums;
    }
   
    // METHODS

    public Piece piece(int row, int colum){
        return pieces[row][colum];
    }

    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColum()];
    }

}
