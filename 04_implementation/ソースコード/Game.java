package Mini;

import java.util.ArrayList;

public class Game {
	
	private Player currentPlayer; //現プレイヤー
	private Player firstPlayer;	//先攻プレイヤー
	private Player secondPlayer; //後攻プレイヤー
	private Board board;
	private ArrayList<Turn> recordTurn = new ArrayList<Turn>(); //ターン履歴
	
	public Game(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
		currentPlayer = this.firstPlayer;
		this.board = new Board();
	}
	
	public void start() {
		board.showBoard();
		while(board.isComplete() == false || board.isFull() == false) {
			Turn turn = new Turn(currentPlayer);
			turn.execute(board);
			board.showBoard();
			if(board.isComplete() == true) {
				recordTurn.add(turn);
				winner(currentPlayer);
				
				break;
			}
			board.isFull();
			if(board.isFull() == true) {
				recordTurn.add(turn);
				draw();
				
				break;
			}
			changePlayer();
			recordTurn.add(turn);
		}
	}
	
	private void changePlayer() {
		if(recordTurn.size() % 2 == 1) {
			currentPlayer = firstPlayer;
		}else {
			currentPlayer = secondPlayer;
		} 
	}
	
	public void winner(Player currentPlayer) {
		if(recordTurn.size() % 2 == 1) {
			System.out.println("勝者：先攻");
		}else {
			System.out.println("勝者：後攻");
		}
		System.out.println("");
		System.out.println("<ターン履歴>");
		//1ターン表示用メソッドをターン分繰り返す
		for(int i =0; i < recordTurn.size(); i++) {
			Turn turn = recordTurn.get(i);
			if(i % 2 == 0) {
				System.out.print("先攻：");
				turn.showTurn(board);
				System.out.println("");
			}else {
				System.out.print("後攻：");
				turn.showTurn(board);
				System.out.println("");
			}
		}
	}
	
	public void draw() {
		System.out.println("引き分け");
		System.out.println("");
		System.out.println("<ターン履歴>");
		//1ターン表示用メソッドをターン分繰り返す
		for(int i =0; i < recordTurn.size(); i++) {
			Turn turn = recordTurn.get(i);
			if(i % 2 == 0) {
				System.out.print("先攻：");
				turn.showTurn(board);
				System.out.println("");
			}else {
				System.out.print("後攻：");
				turn.showTurn(board);
				System.out.println("");
			}
		}
	}
	

	


}
