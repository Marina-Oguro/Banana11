package Minipro;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class PlayerTest {
     private Player player;
     private Board board;
     
    
     
     @Test
     public void test1_1() {
    	 player = new Player("先攻", Mark.CIRCLE);
    	 board = new Board();
    	 Cell coodinate = player.urgeInput(board);
    	 
    	 Cell actual  = board.getCell(0, 0);
    	 
    	 assertThat(actual, is(coodinate));
     }
     
     @Test
     public void test1_2() {
    	 player = new Player("先攻", Mark.CIRCLE);
    	 board = new Board();
    	 Cell coodinate = player.urgeInput(board);
    	 
    	 Cell actual  = board.getCell(3, 3);
    	 
    	 assertThat(actual, is(coodinate));
     }
}
