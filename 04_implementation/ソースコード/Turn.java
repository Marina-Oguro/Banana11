package Mini;

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
		/*Mark mark = cell.getMark();
		cell.setMark(mark);*/
	}
	
	public void execute(Board board) {//Board boardの引数の使い道が謎
		//player.urgeInput(board);
		setCell(player.urgeInput(board));
	}
	
    public void showTurn(Board board) {
        String mark = board.mark2String(cell.getMark());
        System.out.print("("+(this.cell.getX() + 1)+","+(this.cell.getY() + 1)+")"+" "+ mark);
    }


}
