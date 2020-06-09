package Minipro;

enum Mark{CIRCLE, CROSS, NONE,}

public class Cell {
	private int x;
	private int y;
	private Mark mark;
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
		this.mark = Mark.NONE;
	}
	
	public Mark getMark() {
		return mark;
	}
	
	public void setMark(Mark mark) {
		this.mark = mark;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

}
