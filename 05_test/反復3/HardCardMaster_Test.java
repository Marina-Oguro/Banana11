package Minipro2;

import static org.junit.Assert.*;
import org.junit.Test;
import Minipro2.HardCardMaster;

import static org.hamcrest.CoreMatchers.*;


public class HardCardMaster_Test {
	
	Card card;
	Card answerCard;
	int number;
	Suit suit;
	CardStack stack;
	
	@Test
	public void Test1_1() {
		HardCardMaster hCardMaster = new HardCardMaster(stack);
		card = new Card(1, Suit.HEART);
		hCardMaster.answerCard = new Card(1, Suit.HEART);
		
		boolean result = hCardMaster.judge(card);
		
		assertThat(result, is(true));
	}
	
	@Test
	public void Test1_2() {
		HardCardMaster hCardMaster = new HardCardMaster(stack);
		card = new Card(1, Suit.HEART);
		hCardMaster.answerCard = new Card(1, Suit.SPADE);
		
		boolean result = hCardMaster.judge(card);
		
		assertThat(result, is(false));
	}
	
	@Test
	public void Test1_3() {
		HardCardMaster hCardMaster = new HardCardMaster(stack);
		card = new Card(1, Suit.HEART);
		hCardMaster.answerCard = new Card(3, Suit.HEART);
		
		boolean result = hCardMaster.judge(card);
		
		assertThat(result, is(false));
	}
	
	@Test
	public void Test1_4() {
		HardCardMaster hCardMaster = new HardCardMaster(stack);
		card = new Card(1, Suit.HEART);
		hCardMaster.answerCard = new Card(3, Suit.SPADE);
		
		boolean result = hCardMaster.judge(card);
		
		assertThat(result, is(false));
	}

}
