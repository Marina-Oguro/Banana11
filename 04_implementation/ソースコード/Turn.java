package Minipro;

public class Turn {
	private int turnNum = 0;
	private Player player;
	private Cell cell;
	
	public Turn(Player current) {
		this.player = current;
		this.turnNum++;
	}
	
	private void setCell(Cell cell) {
		this.cell=cell;
	}
	
	public void execute(Board board) {
		setCell(player.urgeInput(board));
	}
	
	public void showTurn(Board board) {
		String mark = board.mark2String(cell.getMark());
		System.out.print("("+(this.cell.getX() + 1)+","+(this.cell.getY() + 1)+")"+" "+ mark);
	}

}
