package Minipro;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;


public class Line_Test {
	
	@Test
	public void Test1() {
		Cell cell1 = new Cell(1,1);
		Cell cell2 = new Cell(2,2);
		Cell cell3 = new Cell(3,3);
		cell1.setMark(Mark.CIRCLE);
		cell2.setMark(Mark.CIRCLE);
		cell3.setMark(Mark.CIRCLE);
		
		Line line = new Line(cell1,cell2,cell3);
		
		boolean result = line.isConsective();
		
		assertThat(result, is (true));
	}
	
	@Test
	public void Test2() {
		Cell cell1 = new Cell(1,1);
		Cell cell2 = new Cell(2,2);
		Cell cell3 = new Cell(3,3);
		cell1.setMark(Mark.CIRCLE);
		cell2.setMark(Mark.CROSS);
		cell3.setMark(Mark.CIRCLE);
		
		Line line = new Line(cell1,cell2,cell3);
		
		boolean result = line.isConsective();
		
		assertThat(result, is (false));
	}

}
