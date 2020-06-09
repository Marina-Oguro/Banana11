package Minipro;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;


public class Board_Test {
	
	@Test
	public void Test1_1() {
		Board board = new Board();
		board.canPlace(1,1);
		boolean result = board.canPlace(1,1);
		
		assertThat(result, is(true));
	}
	
	@Test
	public void Test1_2() {
		Board board = new Board();
		Cell cell = board.getCell(1, 1);
		cell.setMark(Mark.CIRCLE);
		board.canPlace(1,1);
		boolean result = board.canPlace(1,1);
		
		assertThat(result, is(false));
	}
	
	@Test
	public void Test2_1() {
		Board board = new Board();
		board.isFull();
		boolean result = board.isFull();
		
		assertThat(result, is(false));
	}
	
	@Test
	public void Test2_2() {
		Board board = new Board();
		Cell cell1 = board.getCell(0, 0);
		cell1.setMark(Mark.CIRCLE);
		Cell cell2 = board.getCell(0, 1);
		cell2.setMark(Mark.CIRCLE);
		Cell cell3 = board.getCell(0, 2);
		cell3.setMark(Mark.CIRCLE);
		Cell cell4 = board.getCell(1, 0);
		cell4.setMark(Mark.CIRCLE);
		Cell cell5 = board.getCell(1, 1);
		cell5.setMark(Mark.CIRCLE);
		Cell cell6 = board.getCell(1, 2);
		cell6.setMark(Mark.CIRCLE);
		Cell cell7 = board.getCell(2, 0);
		cell7.setMark(Mark.CIRCLE);
		Cell cell8 = board.getCell(2, 1);
		cell8.setMark(Mark.CIRCLE);
		Cell cell9 = board.getCell(2, 2);
		cell9.setMark(Mark.CIRCLE);
		board.isFull();
		boolean result = board.isFull();
		
		assertThat(result, is(true));
	}
	
	@Test
	public void Test3_1() {
		Board board = new Board();
		Cell cell1 = board.getCell(0, 0);
		cell1.setMark(Mark.CIRCLE);
		Cell cell2 = board.getCell(0, 1);
		cell2.setMark(Mark.CROSS);
		Cell cell3 = board.getCell(0, 2);
		cell3.setMark(Mark.CROSS);
		Cell cell5 = board.getCell(1, 1);
		cell5.setMark(Mark.CIRCLE);
		Cell cell9 = board.getCell(2, 2);
		cell9.setMark(Mark.CIRCLE);
		board.isComplete();
		boolean result = board.isComplete();
		
		assertThat(result, is(true));
	}
	
	@Test
	public void Test3_2() {
		Board board = new Board();
		Cell cell1 = board.getCell(0, 0);
		cell1.setMark(Mark.CIRCLE);
		board.isComplete();
		boolean result = board.isComplete();
		
		assertThat(result, is(false));
	}
	
	
}
