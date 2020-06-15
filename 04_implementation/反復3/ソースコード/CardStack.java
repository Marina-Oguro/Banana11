package mini2;


	
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.EmptyStackException;


	public class CardStack {

		private static int CARDS = 52;
		private List<Card> cards;
		
		public CardStack() {
			cards = new LinkedList<Card>();
			Suit[] suits = {Suit.SPADE, Suit.DIA, Suit.HEART, Suit.SPADE};
			for(int i = 0; i < CARDS; i++) {
				int number = 1 + (i % Card.MAX);
				Suit suit = suits[(i / Card.MAX)];
				cards.add(new Card(number, suit));
			}
			Collections.shuffle(cards);
		}
		
		public Card drawCard(){
			if (cards.size() != 0) {
				return cards.remove(0);
			} else {
				throw new EmptyStackException();
			}
		}
	}



