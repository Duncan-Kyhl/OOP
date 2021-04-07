
// Designing a chess game to see object oriented programming
// Reference: https://www.geeksforgeeks.org/design-a-chess-game/

// one block of the 8x8 grid and an optional piece
public class Spot {
    private Piece piece; // references piece in class Piece because ...
    private int x; // a private ...
    private int y;

    public Spot(int x, int y, Piece piece)
    {
        this.setPiece(piece); // this. means
        this.setX(x);
        this.setY(y);
    }

    public Piece getPiece()
    {
        return this.piece;
    }

    public void setPiece(Piece p) // void means no value is returned
    {
        this.piece = p;
    }

    public int getX()
    {
        return this.x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return this.y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}

// abstract class for common functionality among all pieces
public abstract class Piece { // an abstract class is
    private boolean killed = false;
    private boolean white = false;

    public Piece(boolean white)
    {
        this.setWhite(white);
    }

    public boolean isWhite()
    {
        return this.white;
    }

    public void setWhite(boolean white)
    {
        this.white = white;
    }

    public boolean isKilled()
    {
        return this.killed;
    }

    public void setKilled(boolean killed)
    {
        this.killed = killed;
    }

    public abstract boolean canMove(Board board, Spot start, Spot end);
}

// King

// Queen
// Bishop
// Rook
// Pawn

// Knight
public class Knight extends Piece {
    public Knight(boolean white)
    {
        super(white);
    }

    @Override 
    public boolean canMove(Board board, Spot start, Spot end)
    {
        // we can't move the piece to a spot that has a piece of the same color
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        return x * y == 2;
    }
}

// Queen
// Bishop
// 

// 8x8 seet of boxes containing all active chess pieces
public class Board {}

// one of the participants of playing the game
public class Player {}

// starting and ending spots and which player made the move
public class Move {}

// flow of the game, keep track of moves, current turn, final result of game
public class Game {}
