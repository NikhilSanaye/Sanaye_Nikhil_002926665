package com.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.print.attribute.HashAttributeSet;

class TicTacToe {

	//Hashmap to store game moves & scores
	public static Map<String, ArrayList<StringScore>> mp=new HashMap<String,ArrayList<StringScore>>();
	private static final Logger LOGGER = LogManager.getLogger(TicTacToe.class);

	static int alpha=1;		//initial state
	static int beta=3;		//event of win
	static int gamma=-1;	//event of loss
	static int delta=2;		//event of draw
	public static Map<String, String> storeMoves;
	static boolean playerWon=false;
	static boolean menaceWon=false;
	static boolean trainingGoingOn=false;
	static boolean dummyPlayer=false;
	static boolean tie=false;
	static boolean trainMenace=false;
	static Random random = new Random();
	static Scanner in;
	static char c = '-';

	public static void main(String[] args) {

		LOGGER.info("Game has started");

		LOGGER.info("Value of alpha(initial state) is: "+ alpha);
		LOGGER.info("Value of beta(event of win) is: "+ beta);
		LOGGER.info("Value of gamma(event of loss) is: "+ gamma);
		LOGGER.info("Value of delta(event of draw) is: "+ delta);

		int input =0;

		do {
			//Create a Scanner and ask for the options
			in = new Scanner(System.in);
			System.out.println("Select option and press enter: ");
			System.out.println("1. Train Menace ");
			System.out.println("2. Play against Menace ");
			System.out.println("3. Exit ");

			if(in.hasNextInt()) {
				input = Integer.parseInt(in.nextLine());
			}else{
				in.nextLine();
			}

			if(input==1) {
				LOGGER.info(" User selected option 1-Training the menace");
				trainMenace=true;
				trainingGoingOn=true;
				for(int i=0;i<400;i++){
					play();
				}
				trainMenace=false;
				trainingGoingOn=false;
			}else if(input==2) {
				LOGGER.info(" User selected option 2-Playing against the menace");
				trainMenace=false;
				play();
			}else if(input==3){
				LOGGER.info(" User selected option 3-Terminating the game");
				System.out.println("Game terminated");
			}else{
				System.out.println("Wrong input");
			}
		}
		while(input!=3);
	}

	private static void play() {

		//HashMap to store moves played in current game
		storeMoves= new HashMap<String, String>();
		//Create a 3x3 array that represents our tic tac toe board
		char[][] board = new char[3][3];

		//Initialize our board with dashes (empty positions)
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}

		String p1="";
		if(!trainingGoingOn) {
			System.out.println("Let's play Tic Tac Toe!");
			LOGGER.info("Let's play Tic Tac Toe!");
			System.out.print("Player 1, what is your name? ");

			p1 = in.nextLine();
			LOGGER.info("Player 1 name is:"+p1);
			System.out.println("Player 2 is the menace ");
			LOGGER.info("Player 2 is the menace ");
		}

		if(trainingGoingOn) {
			p1="dummy-player";
			LOGGER.info("Player 1 name is:"+p1);
			dummyPlayer=true;
			LOGGER.info("Player 2 name is menace");
		}
		//computer's turn variable
		boolean computerTurn=false;

		//Create a player1 boolean that is true if it is player 1's turn
		boolean player = true;
		if(trainMenace) {
			player=false;
		}

		//Create a gameEnded boolean and use it as the condition in the while loop
		boolean gameEnded = false;
		while(!gameEnded) {

			//Draw the board
			drawBoard(board);

			//Print whose turn it is
			if(dummyPlayer && trainingGoingOn) {
				System.out.println("Dummy player's Turn (x):");
				LOGGER.info("Dummy player's Turn (x):");
			}
			if(!trainingGoingOn) {
				if(player) {
					System.out.println(p1 + "'s Turn (x):");
					LOGGER.info(p1 + "'s Turn (x):");
				} }
			if(computerTurn){
				System.out.println("Computer's Turn (o):");
				LOGGER.info("Computer's Turn (o):");
				computerTurn=true;
			}

			//Create a char variable that stores either 'x' or 'o' based on what player's turn it is
			if(player || dummyPlayer) {
				c = 'x';
			} if(computerTurn) {
				c = 'o';
			}

			//Create row and col variables which represent indexes that correspond to a position on our board
			int row = 0;
			int col = 0;

			//Only break out of the while loop once the user enters a valid position
			while(true) {
				if(computerTurn) {
					String boardBeforeCompMove=convertBoardToString(board);
					makeComputerTurn(board);
					String boardAfterCompMove=convertBoardToString(board);
					storeInMap(boardBeforeCompMove, boardAfterCompMove);
					storeMoves.put(boardBeforeCompMove, boardAfterCompMove);
					if(trainingGoingOn) {
						computerTurn=false;
					}
					trainMenace=true;
					dummyPlayer=true;
					break;
				}

				if(dummyPlayer && trainingGoingOn) {
					makeComputerTurn(board);
					computerTurn=true;
					trainMenace=false;
					player=false;
					dummyPlayer=false;
					break;
				}

				if(!trainingGoingOn && player) {
					//Ask the user for what position they want to place their x or o
					System.out.print("Enter a row number (0, 1, or 2): ");
					row = in.nextInt();
					System.out.print("Enter a column number (0, 1, or 2): ");
					col = in.nextInt();

					//Check if the row and col are 0, 1, or 2
					if(row < 0 || col < 0 || row > 2 || col > 2) {
						System.out.println("This position is off the bounds of the board! Try again.");

						//Check if the position on the board the user entered is empty (has a -) or not
					} else if(board[row][col] != '-') {
						System.out.println("Someone has already made a move at this position! Try again.");

						//Otherwise, the position is valid so break out of the while loop
					} else {
						LOGGER.info(p1+" played on row-"+row+" column-"+col);
						break;
					}
				}
			}

			//Set the position on the board at row, col to c
			if(!trainingGoingOn) {
				if(player)
					board[row][col] = c;
			}

			//Check to see if either player has won
			if(playerHasWon(board) == 'x') {
				System.out.println(p1 + " has won!");
				LOGGER.info(p1 + " has won!");
				playerWon=true;
				gameEnded = true;
				processScores(storeMoves);
			} else if(playerHasWon(board) == 'o') {
				System.out.println("Computer has won!");
				LOGGER.info("Computer has won!");
				menaceWon=true;
				gameEnded = true;
				processScores(storeMoves);
			} else {

				//If neither player has won, check to see if there has been a tie (if the board is full)
				if(boardIsFull(board)) {
					System.out.println("It's a tie!");
					LOGGER.info("It's a tie!");
					tie=true;
					gameEnded = true;
					processScores(storeMoves);
				} else {
					//If player1 is true, make it false, and vice versa; this way, the players alternate each turn
					if(!trainingGoingOn) {
						player = !player;
						computerTurn=!computerTurn;
					}
				}
			}
		}

		//Draw the board at the end of the game
		drawBoard(board);

	}

	private static void processScores(Map<String, String> storeGameMoves) {
		if(menaceWon) {
			// increase points with alpha of all the moves in case of win
			modifyScores(storeGameMoves, beta);
		}else if(playerWon) {
			// deduct points of all the moves in case of win
			modifyScores(storeGameMoves, gamma);
		}else if(tie){
			// increase points  with delta of all the moves in case of tie
			modifyScores(storeGameMoves, delta);
		}
	}

	private static void modifyScores(Map<String, String> storeGameMoves, int point) {
		for(Map.Entry<String, String> entry : storeGameMoves.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();

			ArrayList<StringScore> x = mp.get(key);
			for(StringScore s:x) {
				if(s.getCounterMove().equals(value)) {
					s.setScore(s.getScore()+point);
					//uncomment to print scores
					//System.out.println("Move "+key+","+value+" "+s.score);
				}
			}
		}
	}

	//store game moves & counter moves in thr map
	private static void storeInMap(String boardBeforeCompMove, String boardAfterCompMove) {
		if(mp.containsKey(boardBeforeCompMove)) {
			addExistingKey(boardBeforeCompMove,boardAfterCompMove);
		}else {
			StringScore ss= new StringScore();
			ss.setCounterMove(boardAfterCompMove);
			ss.setScore(alpha);
			ArrayList<StringScore> list=new ArrayList<StringScore>();
			list.add(ss);
			mp.put(boardBeforeCompMove, list);
		}
	}

	private static void addExistingKey(String st1, String st2) {

		ArrayList<StringScore> lt = mp.get(st1);
		if(!checkifCounterMovePresent(lt, st2)) {
			StringScore x= new StringScore();
			x.setCounterMove(st2);
			x.setScore(alpha);
			lt.add(x);
		}
	}


	private static boolean checkifCounterMovePresent(ArrayList<StringScore> lt, String st2) {
		for(StringScore x:lt) {
			if(x.getCounterMove().equals(st2)) {
				return true;
			}
		}
		return false;
	}

	public static String convertBoardToString(char[][] c){
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				builder.append(c[i][j]);
			}
		}
		return builder.toString();
	}

	private static void makeComputerTurn(char[][] board) {
		//If the menace is under training, It will select move created by method-makeMovesForTrainingMenace
		//method- makeMovesForTrainingMenace uses human strategy to win
		if(trainingGoingOn) {
			makeMovesForTrainingMenace(board,c);
		}else {
			//This method selects best moves available in hashmap
			selectBestMoveAvailableInHashMap(board);
		}
	}

	private static void selectBestMoveAvailableInHashMap(char[][] board) {
		//select available counter moves in map gained from experience
		String st=convertBoardToString(board);
		ArrayList<StringScore> listMoves = mp.get(st);
		ArrayList<String> movesCollection= new ArrayList<String>();

		if(null!=listMoves && listMoves.size()>0) {
			//create instances of available counter moves and then select random counter move
			//number of instances is equal to the score of the move
			for(StringScore s:listMoves) {
				for(int i=0;i<s.getScore();i++) {
					movesCollection.add(s.getCounterMove());
				}
			}

			if(movesCollection.size()>0) {
				//select random move from list(similar to selecting beads from match boxes)
				int rand = random.nextInt(movesCollection.size()-1);
				String selectedMove = movesCollection.get(rand);
				char[][] convertedBoard=convertMoveToBoard(selectedMove);

				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						if(convertedBoard[i][j]!=board[i][j]) {
							board[i][j]='o';
							//System.out.println("selected from hashmap");
							return;
						}
					}
				}
			}else {
				//select random move as counter moves are not available from previous experience
				//System.out.println("Moves not found in HashMap, Please train the menace, Playing random move");
				makeMovesForTrainingMenace(board,c);
			}
		}else {
			//select random move as counter moves are not available from previous experience
			//System.out.println("Moves not found in HashMap, Please train the menace, Playing random move");
			makeMovesForTrainingMenace(board,c);
		}
	}

	//converting board array to string format
	public static char[][] convertMoveToBoard(String selectedMove) {
		char[][] c=new char[3][3];
		int k=0;
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j]= selectedMove.charAt(k);
				k++;
			}
		}
		return c;
	}
	//method to make random move
	public static void makeMovesForTrainingMenace(char[][] board, char c) {
		if(c=='o' && trainingGoingOn){
		if(ImproveMove.makeTrainingMoveToWin(board,c)){
			//System.out.println("making move to win");
			return;
		}}
		//make a random move
		if(!makeMoveToSave(board)) {
			int rnd1;
			int rnd2;
			while(true) {
				rnd1 = random.nextInt(board.length);
				rnd2 = random.nextInt(board[rnd1].length);
				if(board[rnd1][rnd2]=='-') {
					break;
				}
			}
			board[rnd1][rnd2]=c;
		}
		return;
	}

	//Used only in training mode
	//Human strategy to select moves
	//Used when opponent has 2 x's in row/column/diagonal
	private static boolean makeMoveToSave(char[][] board) {
		if(trainingGoingOn) {
			int tempRow = 4;
			int tempColumn = 4;
			ArrayList<Integer> list = null;
			list = checkRows(board);
			if (null != list) {
				if (list != null && list.size() == 2 && list.get(0) < 3 && list.get(1) < 3) {
					tempRow = list.get(0);
					tempColumn = list.get(1);
					board[tempRow][tempColumn] = c;
					//System.out.println("Played move rows to save");
					return true;
				}
			}
			if (list == null || list.size() == 0) {
				list = checkColumns(board);
				if (list != null && list.size() == 2 && list.get(0) < 3 && list.get(1) < 3) {
					tempRow = list.get(0);
					tempColumn = list.get(1);
					board[tempRow][tempColumn] = c;
					//System.out.println("Played move column to save");
					return true;
				}
			}

			if (list == null || list.size() == 0) {
				list = checkDiagonals(board);
				if (list != null && list.size() == 2 && list.get(0) < 3 && list.get(1) < 3) {
					tempRow = list.get(0);
					tempColumn = list.get(1);
					board[tempRow][tempColumn] = c;
					//System.out.println("Played move diag to save");
					return true;
				}
			}
		}
		return false;
	}

	//method to check if rows contain 2 x's
	public static ArrayList<Integer> checkRows(char[][] board) {
		ArrayList<Integer> l= new ArrayList<Integer>();
		int tempColumn = 4;
		int tempRow = 4;
		for(int i = 0; i < 3; i++) {
			if(board[i][0]=='x' && (board[i][0] == board[i][1]) && board[i][2]=='-') {
				tempColumn=2;
				tempRow=i;
				l.add(tempRow);l.add(tempColumn);
				break;
			}
			if(board[i][1]=='x' && board[i][1] == board[i][2] && board[i][0]=='-') {
				tempColumn=0;
				tempRow=i;
				l.add(tempRow);l.add(tempColumn);
				break;
			}
			if(board[i][0]=='x' && board[i][0] == board[i][2] && board[i][1]=='-') {
				tempColumn=1;
				tempRow=i;
				l.add(tempRow);l.add(tempColumn);
				break;
			}
		}
		return l;
	}

	//method to check if columns contain 2 x's
	public static ArrayList<Integer> checkColumns(char[][] board) {
		ArrayList<Integer> l= new ArrayList<Integer>();
		int tempRow = 4;
		int tempColumn = 4;
		//Check each column
		for(int j = 0; j < 3; j++) {
			if(board[0][j]=='x' && (board[0][j] == board[1][j]) && board[2][j]=='-') {
				tempRow=2;
				tempColumn=j;
				l.add(tempRow);l.add(tempColumn);
				break;
			}
			if(board[1][j]=='x' && board[1][j] == board[2][j] && board[0][j]=='-') {
				tempRow=0;
				tempColumn=j;
				l.add(tempRow);l.add(tempColumn);
				break;
			}
			if(board[0][j]=='x' && board[0][j] == board[2][j] && board[1][j]=='-') {
				tempRow=1;
				tempColumn=j;
				l.add(tempRow);l.add(tempColumn);
				break;
			}
		}
		return l;
	}

	//method to check if diagonal contain 2 x's
	public static ArrayList<Integer> checkDiagonals(char[][] board) {
		ArrayList<Integer> l= new ArrayList<Integer>();
		int tempRow=4;
		int tempColumn=4;
		//Check the diagonals
		if(board[0][0] == board[1][1] && board[0][0]=='x' && board[2][2]=='-') {
			tempRow=2;
			tempColumn=2;
			l.add(tempRow);l.add(tempColumn);
			return l;
		}
		if(board[0][0] == board[2][2] && board[0][0]=='x' && board[1][1]=='-') {
			tempRow=1;
			tempColumn=1;
			l.add(tempRow);l.add(tempColumn);
			return l;
		}
		if(board[2][2] == board[1][1] && board[2][2]=='x' && board[0][0]=='-') {
			tempRow=0;
			tempColumn=0;
			l.add(tempRow);l.add(tempColumn);
			return l;
		}

		if(board[0][2] == board[1][1] && board[0][2]=='x' && board[2][0]=='-') {
			tempRow=2;
			tempColumn=0;
			l.add(tempRow);l.add(tempColumn);
			return l;
		}
		if(board[0][2] == board[2][0] && board[0][2]=='x' && board[1][1]=='-') {
			tempRow=1;
			tempColumn=1;
			l.add(tempRow);l.add(tempColumn);
			return l;
		}
		if(board[2][0] == board[1][1] && board[1][1]=='x' && board[0][2]=='-') {
			tempRow=0;
			tempColumn=2;
			l.add(tempRow);l.add(tempColumn);
			return l;
		}
		return l;
	}

	//Make a function to draw the tic tac toe board
	public static void drawBoard(char[][] board) {
		StringBuilder sb;
		System.out.println("Board:");
		LOGGER.info("Board:");
		for(int i = 0; i < 3; i++) {
			sb=new StringBuilder();
			//The inner for loop prints out each row of the board
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
				sb.append(board[i][j]);
				sb.append(" ");
			}
			LOGGER.info(sb.toString());
			//This print statement makes a new line so that each row is on a separate line
			System.out.println();
		}
	}

	//Make a function to see if someone has won and return the winning char
	public static char playerHasWon(char[][] board) {

		//Check each row
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
				return board[i][0];
			}
		}

		//Check each column
		for(int j = 0; j < 3; j++) {
			if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
				return board[0][j];
			}
		}

		//Check the diagonals
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
			return board[0][0];
		}
		if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && board[2][0] != '-') {
			return board[2][0];
		}

		//Otherwise nobody has not won yet
		return ' ';
	}
1
	//Make a function to check if all of the positions on the board have been filled
	public static boolean boardIsFull(char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
}
