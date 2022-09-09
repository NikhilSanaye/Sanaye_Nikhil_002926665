package com.project;

import java.util.ArrayList;

public class ImproveMove {

    public static boolean makeTrainingMoveToWin(char[][] board, char c) {
        // Logic runs only for training purpose
            int tempRow = 4;
            int tempColumn = 4;
            ArrayList<Integer> list = null;
            list = checkRows(board);
            if (null != list) {
                if (list != null && list.size() == 2 && list.get(0) < 3 && list.get(1) < 3) {
                    tempRow = list.get(0);
                    tempColumn = list.get(1);
                    board[tempRow][tempColumn] = c;
                    //System.out.println("Played move rows to win");
                    return true;
                }
            }
            if (list == null || list.size() == 0) {
                list = checkColumns(board);
                if (list != null && list.size() == 2 && list.get(0) < 3 && list.get(1) < 3) {
                    tempRow = list.get(0);
                    tempColumn = list.get(1);
                    board[tempRow][tempColumn] = c;
                    //System.out.println("Played move column to win");
                    return true;
                }
            }

            if (list == null || list.size() == 0) {
                list = checkDiagonals(board);
                if (list != null && list.size() == 2 && list.get(0) < 3 && list.get(1) < 3) {
                    tempRow = list.get(0);
                    tempColumn = list.get(1);
                    board[tempRow][tempColumn] = c;
                    //System.out.println("Played move diag to win");
                    return true;
                }
            }
        return false;
    }

    //method to check if rows contain 2 o's
    public static ArrayList<Integer> checkRows(char[][] board) {
        ArrayList<Integer> l= new ArrayList<Integer>();
        int tempColumn = 4;
        int tempRow = 4;
        for(int i = 0; i < 3; i++) {
            if(board[i][0]=='o' && (board[i][0] == board[i][1]) && board[i][2]=='-') {
                tempColumn=2;
                tempRow=i;
                l.add(tempRow);l.add(tempColumn);
                break;
            }
            if(board[i][1]=='o' && board[i][1] == board[i][2] && board[i][0]=='-') {
                tempColumn=0;
                tempRow=i;
                l.add(tempRow);l.add(tempColumn);
                break;
            }
            if(board[i][0]=='o' && board[i][0] == board[i][2] && board[i][1]=='-') {
                tempColumn=1;
                tempRow=i;
                l.add(tempRow);l.add(tempColumn);
                break;
            }
        }
        return l;
    }

    //method to check if columns contain 2 o's
    public static ArrayList<Integer> checkColumns(char[][] board) {
        ArrayList<Integer> l= new ArrayList<Integer>();
        int tempRow = 4;
        int tempColumn = 4;
        //Check each column
        for(int j = 0; j < 3; j++) {
            if(board[0][j]=='o' && (board[0][j] == board[1][j]) && board[2][j]=='-') {
                tempRow=2;
                tempColumn=j;
                l.add(tempRow);l.add(tempColumn);
                break;
            }
            if(board[1][j]=='o' && board[1][j] == board[2][j] && board[0][j]=='-') {
                tempRow=0;
                tempColumn=j;
                l.add(tempRow);l.add(tempColumn);
                break;
            }
            if(board[0][j]=='o' && board[0][j] == board[2][j] && board[1][j]=='-') {
                tempRow=1;
                tempColumn=j;
                l.add(tempRow);l.add(tempColumn);
                break;
            }
        }
        return l;
    }

    //method to check if diagonal contain 2 o's
    public static ArrayList<Integer> checkDiagonals(char[][] board) {
        ArrayList<Integer> l= new ArrayList<Integer>();
        int tempRow = 4;
        int tempColumn=4;
        //Check the diagonals
        if(board[0][0] == board[1][1] && board[0][0]=='o' && board[2][2]=='-') {
            tempRow=2;
            tempColumn=2;
            l.add(tempRow);l.add(tempColumn);
            return l;
        }
        if(board[0][0] == board[2][2] && board[0][0]=='o' && board[1][1]=='-') {
            tempRow=1;
            tempColumn=1;
            l.add(tempRow);l.add(tempColumn);
            return l;
        }
        if(board[2][2] == board[1][1] && board[2][2]=='o' && board[0][0]=='-') {
            tempRow=0;
            tempColumn=0;
            l.add(tempRow);l.add(tempColumn);
            return l;
        }


        if(board[0][2] == board[1][1] && board[0][2]=='o' && board[2][0]=='-') {
            tempRow=2;
            tempColumn=0;
            l.add(tempRow);l.add(tempColumn);
            return l;
        }
        if(board[0][2] == board[2][0] && board[0][2]=='o' && board[1][1]=='-') {
            tempRow=1;
            tempColumn=1;
            l.add(tempRow);l.add(tempColumn);
            return l;
        }
        if(board[2][0] == board[1][1] && board[1][1]=='o' && board[0][2]=='-') {
            tempRow=0;
            tempColumn=2;
            l.add(tempRow);l.add(tempColumn);
            return l;
        }
        return l;
    }
}
