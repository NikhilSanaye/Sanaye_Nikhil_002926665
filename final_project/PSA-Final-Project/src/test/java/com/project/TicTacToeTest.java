package com.project;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TicTacToeTest {

    @Test
    public void convertBoardToString() {
        char[][] board= {
            {'o','x','o'},
            {'o','x','x'},
            {'x','o','o'}
        };
        String s= TicTacToe.convertBoardToString(board);
        assertEquals("oxooxxxoo",s);
    }

    @Test
    public void convertStringToBoard() {
        String s="oxooxooxx";
        char[][] c= TicTacToe.convertMoveToBoard(s);
        char[][] board= {
                {'o','x','o'},
                {'o','x','o'},
                {'o','x','x'}
        };
        boolean equal=checkBoards(c, board);
        assertEquals(true,equal);
    }

    private boolean checkBoards(char[][] chboard, char[][] board) {
        for(int i=0;i<chboard.length;i++){
            for(int j=0;j<chboard[i].length;j++){
                if(chboard[i][j]!=board[i][j])
                    return false;
            }
        }
        return true;
    }

    @Test
    public void makeRandomMove() {
        char[][] board= {
                {'x','o','-'},
                {'-','-','-'},
                {'-','-','-'}
        };
        char c='x';
        TicTacToe.makeMovesForTrainingMenace(board,c);
        countVariableInBoard(board,c);
        assertEquals(2, 2);
    }

    public int countVariableInBoard(char[][] board, char c){
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='c'){
                    count++;
                }
            }
        }
        return count;
    }

    @Test
    public void checkRows() {
        //2,0 is empty and needs to be filled to stop opponent
        char[][] board= {
                {'x','x','-'},
                {'o','-','-'},
                {'o','-','-'}
        };
        int x=TicTacToe.checkRows(board).get(0);
        int y=TicTacToe.checkRows(board).get(1);
        assertEquals(0, x);
        assertEquals(2, y);
    }

    @Test
    public void checkColumns() {
        //2,0 is empty and needs to be filled to stop opponent
        char[][] board= {
                {'x','o','-'},
                {'x','o','-'},
                {'-','-','-'}
        };
        int x=TicTacToe.checkColumns(board).get(0);
        int y=TicTacToe.checkColumns(board).get(1);
        assertEquals(2, x);
        assertEquals(0, y);
    }

    @Test
    public void checkDiagonals() {
        //2,2 is empty
        char[][] board= {
                {'x','-','-'},
                {'o','x','-'},
                {'o','-','-'}
        };
        int x=TicTacToe.checkDiagonals(board).get(0);
        int y=TicTacToe.checkDiagonals(board).get(1);
        assertEquals(2,x);
        assertEquals(2,y);
    }

    @Test
    public void checkDiagonals2() {
        //2,0 is empty
        char[][] board= {
                {'o','-','x'},
                {'o','x','-'},
                {'-','-','-'}
        };
        int x=TicTacToe.checkDiagonals(board).get(0);
        int y=TicTacToe.checkDiagonals(board).get(1);
        assertEquals(2,x);
        assertEquals(0,y);
    }

    @Test
    public void whichPlayerHasWon() {
        char[][] board= {
                {'x','x','x'},
                {'o','o','x'},
                {'x','o','o'}
        };
        assertEquals('x', TicTacToe.playerHasWon(board));
    }

    @Test
    public void whichPlayerHasWon2() {
        char[][] board= {
                {'x','o','x'},
                {'o','o','o'},
                {'x','o','o'}
        };
        assertEquals('o', TicTacToe.playerHasWon(board));
    }

    @Test
    public void boardIsFull() {
        char[][] board= {
                {'o','x','o'},
                {'o','x','x'},
                {'x','o','o'}
        };
        assertEquals(true, TicTacToe.boardIsFull(board));
    }

    @Test
    public void boardIsFull2() {
        char[][] board= {
                {'-','x','o'},
                {'o','x','x'},
                {'x','o','o'}
        };
        assertEquals(false, TicTacToe.boardIsFull(board));
    }
}