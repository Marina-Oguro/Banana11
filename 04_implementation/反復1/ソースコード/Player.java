package Minipro;

import java.util.*;

public class Player {

	private Mark mark;
	private String name;
	private int x;
	private int y;

	public Player(String name, Mark mark) {
		this.name = name;
		this.mark = mark;
	}

	public void playerInput(Board board) {// コンソールに座標を入力するs
		System.out.println("列と行を、半角スペースで区切って数字を入力してください　(例 : ２列目の３行目　→ 2 3)");
		while (true) {
			Scanner scanner = new Scanner(System.in);
			int coordinate1 = scanner.nextInt();
			int coordinate2 = scanner.nextInt();
			if (1 <= coordinate1 && coordinate1 <= 3 && 1 <= coordinate2 && coordinate2 <= 3) {
				x = coordinate1 -1;
				y = coordinate2 -1;
				if(board.canPlace(x, y) == true) {
					Cell cell = board.getCell(x, y);
					cell.setMark(mark);
					break;
				}else {
					System.out.println("既に置かれています。");
				}
			} else {
				System.out.println("1~3の数値を入力してください");
			}
		}
			
	}
	
	public Cell urgeInput(Board board) {
        playerInput(board);
        return board.getCell(x,y);
    }
	

}
