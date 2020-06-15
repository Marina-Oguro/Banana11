package Minipro2;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class CardGame_Test {
	
	private void assertThat(int[] result, Matcher<Iterable<Integer>> hasItems) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	@Test
	public void Test1_1() {
		CardGame game = new CardGame();
		int[] result = game.promptInput();
		assertThat(result, hasItems(1,1));
	}

	@Test
	public void Test1_2() {//目視で確認
		CardGame game = new CardGame();
		int[] result = game.promptInput();
		//assertThat(result, is("数を1～13、スートを0～3の範囲で入力してください"));
	}

	@Test
	public void Test1_3() {//目視で確認
		CardGame game = new CardGame();
		int[] result = game.promptInput();
		//assertThat(result, is("数を1～13、スートを0～3の範囲で入力してください"));
	}

	@Test
	public void Test1_4() {//目視で確認
		CardGame game = new CardGame();
		int[] result = game.promptInput();
		//assertThat(result, is("数を1～13、スートを0～3の範囲で入力してください"));
	}
}
	