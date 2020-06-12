package Minipro2;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class CardGame_Test {

	@Test
	public void Test1_1() {
		CardGame game = new CardGame();
		int result = game.promptInputNumber();
		assertThat(result, is(1));
	}

	@Test
	public void Test1_2() {
		CardGame game = new CardGame();
		int result = game.promptInputNumber();
		assertThat(result, is(13));
	}

	@Test
	public void Test1_3() {
		CardGame game = new CardGame();
		int result = game.promptInputNumber();
		assertThat(result, is("数を1～13の範囲で入力してください"));
	}

	@Test
	public void Test2_1() {
		CardGame game = new CardGame();
		Suit result = game.promptInputSuit();
		assertThat(result, is(Suit.SPADE));
	}

	@Test
	public void Test2_2() {
		CardGame game = new CardGame();
		Suit result = game.promptInputSuit();
		assertThat(result, is(Suit.CLOVER));
	}

	@Test
	public void Test2_3() {
		CardGame game = new CardGame();
		Suit result = game.promptInputSuit();
		assertThat(result, is("スートを0～3の数字で入力してください。"));
	}

}
