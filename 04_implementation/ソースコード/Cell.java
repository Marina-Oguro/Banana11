package Minipro;

enum Mark{CIRCLE, CROSS, NONE,}

public class Cell {
	private int x;
	private int y;
	private Mark mark;
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Mark getMark() {
		return mark;
	}
	
	public void setMark(Mark mark) {
		this.mark = mark;
	}

}
