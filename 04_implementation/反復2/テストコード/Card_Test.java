package Minipro2;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class Card_Test {
	
	@Test
	public void Test1_1() {
		Card card = new Card(1, Suit.SPADE);
		int result = card.getNumber();
		
		assertThat(result, is(1));
	}
	
	
	@Test
	public void Test2_1() {
		Card card = new Card(1, Suit.SPADE);
		Suit result = card.getSuit();
		
		assertThat(result, is(Suit.SPADE));
	}
	
	@Test
	public void Test2_2() {
		Card card = new Card(1, Suit.DIA);
		Suit result = card.getSuit();
		
		assertThat(result, is(Suit.DIA));
	}
	
	@Test
	public void Test2_3() {
		Card card = new Card(1, Suit.HEART);
		Suit result = card.getSuit();
		
		assertThat(result, is(Suit.HEART));
	}
	
	@Test
	public void Test2_4() {
		Card card = new Card(1, Suit.CLOVER);
		Suit result = card.getSuit();
		
		assertThat(result, is(Suit.CLOVER));
	}

}
