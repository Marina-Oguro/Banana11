package Minipro;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Player firstPlayer = new Player("先攻", Mark.CIRCLE);
		Player secondPlayer = new Player("後攻", Mark.CROSS);
		Game game = new Game(firstPlayer, secondPlayer);
		game.start();


	}

}
