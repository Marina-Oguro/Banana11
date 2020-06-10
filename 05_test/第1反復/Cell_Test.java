package Minipro;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class Cell_Test {

	@Test
	public void テスト1() {
		Cell cell = new Cell(1, 1);
		cell.setMark(Mark.CIRCLE);
		Mark result = cell.getMark();

		assertThat(result, is(Mark.CIRCLE));
	}

	@Test
	public void テスト2() {
		Cell cell = new Cell(1, 1);
		cell.setMark(Mark.CROSS);
		Mark result = cell.getMark();

		assertThat(result, is(Mark.CROSS));
	}
	
	@Test
	public void テスト3() {
		Cell cell = new Cell(1, 1);
		cell.setMark(Mark.NONE);
		Mark result = cell.getMark();

		assertThat(result, is(Mark.NONE));
	}

}
