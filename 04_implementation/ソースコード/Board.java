package Minipro;


public class Board {
	
	public int size = 3;
	private Cell[][] nizigenCells = new Cell[size][size];
	public Cell[] cells = new Cell[9];
	public Line[] lines = new Line[8];
	
	public Board() {
		for(int x = 0; x < size; x++) {
			for(int y = 0; y < size; y++) {
				Cell cell = new Cell(x, y);
				nizigenCells[x][y] = cell;
			}
		}
		int count = 0;
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				cells[count] = nizigenCells[i][j];
				count++;
			}
		}
		createLine();
	}
	
	//8ライン作成
	public void createLine() {
		// 横のLine(3ライン)を生成する(lines[0]~lines[2])
        for (int y = 1; y <= 3; y++) {
            Line line = new Line(cells[3 * (y - 1)], cells[3 * (y - 1) + 1], cells[3 * (y - 1) + 2]);
            lines[y - 1] = line;
        }

 

        // 縦のLine(３ライン)を生成する(lines[3]~lines[5])
        for (int x = 1; x <= 3; x++) {
            Line line = new Line(cells[(x - 1)], cells[(x - 1) + 3], cells[(x - 1) + 6]);
            lines[x + 2] = line;
        }

 

        // 斜めのLine(2ライン)を生成する(lines[6](左斜め),lines[7](右斜め))
        lines[6] = new Line(cells[0], cells[4], cells[8]);
        lines[7] = new Line(cells[2], cells[4], cells[6]);
	}
	
	public Cell getCell(int x, int y) {
		this.nizigenCells[x][y] = nizigenCells[x][y];
		return nizigenCells[x][y];
	}
	
	public boolean canPlace(int x, int y) {
		nizigenCells[x][y].getMark();
		if(nizigenCells[x][y].getMark() != Mark.NONE) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean isComplete() {
		boolean ret = false;
		for(int i = 0; i < lines.length; i++) {
			lines[i].isConsective();
			if(lines[i].isConsective() == true) {
				ret = true;
				break;
			}
		}
		return ret;
	}
	
	public boolean isFull() {
		boolean ret = true;
		for(int i = 0; i < cells.length; i++) {
			if(cells[i].getMark() == Mark.NONE) {
					ret = false;
					break;
				}else {
					ret = true;
			}
		}
		return ret;
	}
	
	public String mark2String(Mark mark) {
		// getMarkメソッドで得たマークを記号であらわす
		switch (mark) {
		case CIRCLE:
			return "○";
		case CROSS:
			return "×";
		case NONE:
			return " ";
		default:
			return " ";
		}
	}
	
	public void showBoard() {
		// 盤面を表示する
		for (int y = 1; y <= 3; y++) {
			System.out.println("-------");
			for (int x = 1; x <= 3; x++) {
				System.out.print("|");
				String mark = this.mark2String(cells[3 * (y - 1) + (x - 1)].getMark());
				System.out.print(mark);
			}
			System.out.println("|");
		}
		System.out.println("-------");
	}
	

}
