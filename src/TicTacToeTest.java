import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void createBoard() {
        int rows=3;
        int columns=3;
        int[][] copy={{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertArrayEquals(copy,TicTacToe.createBoard(rows,columns));
    }

    @Test
    void rowsIn() {
        int[][] board={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        int expectedOutput=3;
        assertEquals(expectedOutput,TicTacToe.rowsIn(board));

    }

    @Test
    void columnsIn() {
        int[][] board={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        int expectedOutput=3;
        assertEquals(expectedOutput,TicTacToe.columnsIn(board));
    }

    @Test
    void canPlay() {
        int[][] board={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        int row=2;
        int column=0;
        assertEquals(true,TicTacToe.canPlay(board,row,column));

    }

    @Test
    void play() {
        int[][] board={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        int row=2;
        int column=0;
        int piece=1;

    }

    @Test
    void full() {
        int[][] board={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        assertEquals(false,TicTacToe.full(board));

    }

    @Test
    void winInRow() {
        int[][] board={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        int row=2;
        int piece=2;
        assertEquals(false,TicTacToe.winInRow(board,row,piece));
    }

    @Test
    void winInColumn() {
        int[][] board={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        int row=2;
        int piece=2;
        assertEquals(false,TicTacToe.winInColumn(board,row,piece));
    }

    @Test
    void winInDiagonalBS() {
    }

    @Test
    void winInDiagonalFS() {
    }

    @Test
    void hint() {
    }
}