package Minipro;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;


public class Turn_Test {
	
	@Test//目視で確認
	public void Test1() {
		Player p = new Player("先攻", Mark.CIRCLE);
		Board board = new Board();
		Turn turn = new Turn(p);
		turn.execute(board);
		board.showBoard();
	}

	
	@Test//目視で確認
	public void Test2() {
		Player p = new Player("後攻", Mark.CROSS);
		Board board = new Board();
		Turn turn = new Turn(p);
		turn.execute(board);
		board.showBoard();
	}

}
