package mini2;

enum Suit {
	SPADE,DIA,HEART,CLOVER
}
public class Card {
	
	private int number;
	private Suit suit;
	public static int MAX = 13;
	public static int MIN = 1;
	
	public Card(int number, Suit suit) {
		
		this.number = number;
		this.suit = suit;
		
	}
	
	public int getNumber() {
		return number;
	}
	
	public Suit getSuit() {
		return suit;
	}

}
