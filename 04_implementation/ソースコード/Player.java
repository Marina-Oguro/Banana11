package Mini;


import java.util.*;

public class Player {

	private Mark mark;
	private String name;
	public Board board;
	int x;
	int y;

	public Player(String name, Mark mark) {
		this.name = name;
		this.mark = mark;
	}

	public void playerInput(Board board) {// コンソールに座標を入力するs
		System.out.println("列と行を、半角スペースで区切って入力してください　(例 : ２列目の３行目　→ 2 3)");
		while (true) {
			Scanner scanner = new Scanner(System.in);
			int coordinate1 = scanner.nextInt();
			int coordinate2 = scanner.nextInt();
			if (1 <= coordinate1 && coordinate1 <= 3 && 1 <= coordinate2 && coordinate2 <= 3) {
				// Cell cell = new Cell(coordinate1 - 1, coordinate2 -1 );
				//board.getCell(x, y);
				x = coordinate1 -1;
				y = coordinate2 -1;
				//board.canPlace(x, y);
				if(board.canPlace(x, y) == true) {
					Cell cell = board.getCell(x, y);
					cell.setMark(mark);
					break;
				}else {
					System.out.println("すでおか");
				}
			} else {
				System.out.println("1~3の数値を入力してください");
			}
		}
			
	}
	
	public Cell urgeInput(Board board) {
        //Board board = new Board();
        playerInput(board);
        //Cell cell = board.getCell(x, y);
        //while(board.canPlace(x, y) == false) {
          //System.out.println("すでおか");
            //if(board.canPlace(x, y) == true) {
                //break;
            //}/*else{
           //board.getCell(x, y);
            //}*/
        //}
        //cell.setMark(mark);
        return board.getCell(x,y);
    }
	

}
