package chess;

import boardgame.Board;
import boardgame.Piece;
import chess.enums.Color;

public abstract class ChessPiece extends Piece {
    
    private Color color;

    // CONSTRUCTORS

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    // GET

    public Color getColor() {
        return color;
    }

}
