package mini2;


public class EasyCardMaster extends CardMaster{
	
	public EasyCardMaster(CardStack stack) {
		this.stack = stack;
	}
	
	public boolean judge(Card card) {
		boolean ret = false;
		this.card = card;
		getAnswerCard();
		int a1 = answerCard.getNumber();
		Suit a2 = answerCard.getSuit();
		int b1 = card.getNumber();
		Suit b2 = card.getSuit();
		if(a1 == b1 && a2 == b2) {//数とスートが同じとき
			System.out.println("数:一致");
			System.out.println("スート:一致");
			ret = true;
		}else if(a1 == b1 && a2 != b2) {
			if(isSameColor(a2,b2) == true) {
				System.out.println("数:一致");//入力された数字が同じでスートが色が同じ場合
				System.out.println("スート:惜しい");
			}else {
				System.out.println("数:一致");//入力された数字が同じでスートが一致していない場合
				System.out.println("スート:不一致");
			}
			ret = false;
		}else if(a1 < b1 && a2 == b2) {//入力された数字が答えの数字より大きくてスートが一致している場合
			System.out.println("数:もっと小さい");
			System.out.println("スート:一致");
			ret = false;
		}else if(a1 > b1 && a2 == b2) {//入力された数字が答えの数字より小さくてスートが一致している場合
			System.out.println("数:もっと大きい");
			System.out.println("スート:一致");
			ret = false;
		}else if(a1 > b1 && a2 != b2) {
			if(isSameColor(a2,b2) == true) {
				System.out.println("数:もっと大きい");//入力された数字が答えの数字より小さくてスートが色が同じ場合
				System.out.println("スート:惜しい");
			}else {
				System.out.println("数:もっと大きい");//入力された数字が答えの数字より小さくてスートが一致していない場合
				System.out.println("スート:不一致");
			}
			ret = false;
		}else if(a1 < b1 && a2 != b2) {
			if(isSameColor(a2,b2) == true) {
				System.out.println("スート:惜しい");
			}else {
				System.out.println("数:もっと小さい");//入力された数字が答えの数字より大きくてスートが一致していない場合
				System.out.println("スート:不一致");
			}
			ret = false;
		}
		return ret;
	}
	
	private boolean isSameColor(Suit a2, Suit b2){
		boolean isSame = false;
		switch(a2){
		case SPADE:
		case CLOVER:
			if((b2 == Suit.SPADE) || (b2 == Suit.CLOVER)){
				isSame = true;
			}
			break;
		case HEART:
		case DIA:
			if((b2 == Suit.HEART) || (b2 == Suit.DIA)){
				isSame = true;
			}
			break;
		default:
			// 到達しないはず
			throw new IllegalStateException();
		}
		return isSame;
	}

	

}

