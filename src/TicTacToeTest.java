import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void createBoard() {
        int rows=3;
        int columns=3;
        int[][] board={{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertArrayEquals(board,TicTacToe.createBoard(rows,columns));
    }

    @Test
    void createBoard1(){
        int rows=4;
        int columns=5;
        int[][] board={{0, 0, 0, 0,0}, {0, 0, 0, 0,0}, {0, 0, 0, 0,0}, {0, 0, 0, 0,0}};
        assertArrayEquals(board,TicTacToe.createBoard(rows,columns));
    }

    @Test
    void createBoard2(){
        int rows=5;
        int columns=3;
        int[][] board={{0, 0, 0}, {0, 0, 0}, {0, 0, 0},{0, 0, 0}, {0, 0, 0}};
        assertArrayEquals(board,TicTacToe.createBoard(rows,columns));
    }

    @Test
    void rowsIn() {
        int[][] board={{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int expectedOutput=3;
        assertEquals(expectedOutput,TicTacToe.rowsIn(board));

    }

    @Test
    void rowsIn1() {
        int[][] board = {{34, 64, 2}, {33, 14, 8}, {6, 35, 24}, {222, 13, 74}};
        int expectedOutput = 4;
        assertEquals(expectedOutput, TicTacToe.rowsIn(board));
    }

    @Test
    void rowsIn2() {
        int[][] board = {{22,42,63,2},{2,2,2,2},{17,67,35,86},{0,0,0,0},{23,49,73,54}};
        int expectedOutput = 5;
        assertEquals(expectedOutput, TicTacToe.rowsIn(board));
    }
    @Test
    void columnsIn() {
        int[][] board={{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int expectedOutput=3;
        assertEquals(expectedOutput,TicTacToe.columnsIn(board));
    }

    @Test
    void columnsIn1() {
        int[][] board={{57, 103, 0, 4}, {24, 2, 10,8}, {11, 19, 40,242}, {54, 21, 90,87}};
        int expectedOutput=4;
        assertEquals(expectedOutput,TicTacToe.columnsIn(board));
    }

    @Test
    void columnsIn2() {
        int[][] board={{57, 103, 0, 4,3}, {24, 2,27, 10,8}, {11,3, 19, 40,242}, {54,31, 21, 90,87}};
        int expectedOutput=5;
        assertEquals(expectedOutput,TicTacToe.columnsIn(board));
    }


    @Test
    void canPlay() {
        int[][] board={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        int row=2;
        int column=0;
        int[][] copy={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        // assertArrayEquals(copy,TicTacToe.play(board, row, column));

    }

    @Test
    void canPlay1() {
        int[][] board={{11, 1, 3}, {21, 2, 37}, {44, 75, 6},{38,86,35}};
        int row=1;
        int column=1;
        assertEquals(false,TicTacToe.canPlay(board,row,column));

    }

    @Test
    void canPlay2() {
        int[][] board={{11, 1, 3, 0}, {3, 21, 2, 37}, {91, 44, 75, 6},{38, 86, 35,1}};
        int row=3;
        int column=0;
        assertEquals(false,TicTacToe.canPlay(board,row,column));

    }

    @Test
    void play() {
        int[][] board={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        int row=0;
        int column=0;
        int piece=1;
        assertEquals(piece, TicTacToe.canPlay(board, row, column));

    }

    @Test
    void full() {
        int[][] board={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        assertEquals(false,TicTacToe.full(board));

    }

    @Test
    void full1() {
        int[][] board={{11, 1, 3, 90}, {3, 21, 2, 37}, {91, 44, 75, 6},{38, 86, 35,1}};
        assertEquals(true,TicTacToe.full(board));

    }

    @Test
    void full2() {
        int[][] board={{11, 1, 3, 0}, {3, 21, 2, 37}, {91, 44, 75, 6},{38, 86, 35,1}};
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
    void winInRow1() {
        int[][] board={{1, 1, 1}, {0, 2, 0}, {31, 66, 1}};
        int row=0;
        int piece=1;
        assertEquals(true,TicTacToe.winInRow(board,row,piece));
    }

    @Test
    void winInRow2() {
        int[][] board={{1, 1, 1}, {0, 2, 0}, {2,2,2}};
        int row=2;
        int piece=2;
        assertEquals(true,TicTacToe.winInRow(board,row,piece));
    }

    @Test
    void winInRow3() {
        int[][] board={{23, 43, 56, 7, 18}, {90, 1, 1, 1, 79}, {31, 66, 17, 39,26}};
        int row=1;
        int piece=1;
        assertEquals(true,TicTacToe.winInRow(board,row,piece));
    }

    @Test
    void winInColumn() {
        int[][] board={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        int column=2;
        int piece=2;
        assertEquals(false,TicTacToe.winInColumn(board,column,piece));
    }

    @Test
    void winInColumn1() {
        int[][] board={{1, 31, 98}, {1, 2, 0}, {1, 66, 1}};
        int column=0;
        int piece=1;
        assertEquals(true,TicTacToe.winInColumn(board,column,piece));
    }

    @Test
    void winInColumn2() {
        int[][] board={{9, 27, 398},{1, 31, 98}, {1, 2, 0}, {1, 66, 1}};
        int column=0;
        int piece=1;
        assertEquals(true,TicTacToe.winInColumn(board,column,piece));
    }


    @Test
    void winInDiagonalBS() {
        int[][] board={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        int piece=2;
        assertEquals(false,TicTacToe.winInDiagonalBS(board,piece));

    }

    @Test
    void winInDiagonalBS1() {
        int[][] board={{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int piece=1;
        assertEquals(false,TicTacToe.winInDiagonalBS(board,piece));

    }

    @Test
    void winInDiagonalBS2() {
        int[][] board={{0, 0, 1}, {0, 1, 0}, {1, 0, 0}};
        int piece=1;
        assertEquals(true,TicTacToe.winInDiagonalBS(board,piece));

    }

    @Test
    void winInDiagonalFS() {
        int[][] board={{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};
        int piece=2;
        assertEquals(false,TicTacToe.winInDiagonalFS(board,piece));
    }

    @Test
    void winInDiagonalFS1() {
        int[][] board={{0, 0, 1}, {0, 1, 0}, {1, 0, 0}};
        int piece=1;
        assertEquals(false,TicTacToe.winInDiagonalFS(board,piece));
    }

    @Test
    void winInDiagonalFS2() {
        int[][] board={{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int piece=1;
        assertEquals(false,TicTacToe.winInDiagonalBS(board,piece));
    }

    @Test
    void hint() {
    }
}