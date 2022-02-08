package boardgame;

public class Piece {
    
    protected Position position;
    private Board board;

    // CONSTRUCTORS

    public Piece(){}

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    // GET

    protected Board getBoard() {
        return board;
    }
  
}
