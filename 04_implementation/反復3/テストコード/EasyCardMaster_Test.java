package Minipro2;

import static org.junit.Assert.*;
import org.junit.Test;
import Minipro2.EasyCardMaster;

import static org.hamcrest.CoreMatchers.*;


public class EasyCardMaster_Test {
	
	Card card;
	Card answerCard;
	int number;
	Suit suit;
	CardStack stack;
	
	@Test
	public void Test1_1() {
		EasyCardMaster eCardMaster = new EasyCardMaster(stack);
		card = new Card(1, Suit.HEART);
		eCardMaster.answerCard = new Card(1, Suit.HEART);
		
		boolean result = eCardMaster.judge(card);
		
		assertThat(result, is(true));
	}
	
	@Test
	public void Test1_() {
		EasyCardMaster eCardMaster = new EasyCardMaster(stack);
		card = new Card(1, Suit.HEART);
		eCardMaster.answerCard = new Card(1, Suit.SPADE);
		
		boolean result = eCardMaster.judge(card);
		
		assertThat(result, is(false));
	}
	
	@Test
	public void Test1_3() {
		EasyCardMaster eCardMaster = new EasyCardMaster(stack);
		card = new Card(1, Suit.HEART);
		eCardMaster.answerCard = new Card(3, Suit.HEART);
		
		boolean result = eCardMaster.judge(card);
		
		assertThat(result, is(false));
	}
	
	@Test
	public void Test1_4() {
		EasyCardMaster eCardMaster = new EasyCardMaster(stack);
		card = new Card(1, Suit.HEART);
		eCardMaster.answerCard = new Card(3, Suit.SPADE);
		
		boolean result = eCardMaster.judge(card);
		
		assertThat(result, is(false));
	}

}
