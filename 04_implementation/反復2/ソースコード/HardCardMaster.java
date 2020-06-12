package Minipro2;

public class HardCardMaster extends CardMaster{
    
    public HardCardMaster(CardStack stack) {
    	this.stack = stack;
    }
    
    public boolean judge(Card card) {
        boolean ret = false;
        this.card = card;
        this.getAnswerCard();
        int a1 =answerCard.getNumber();
        Suit a2 =answerCard.getSuit();
        int b1 =card.getNumber();
        Suit b2 =card.getSuit();
        if(a1 == b1 && a2 == b2) {     //両方一致した場合
        	System.out.println("数：一致");
        	System.out.println("スート：一致");
        	ret = true;
        	
        } else if (a1 == b1 && a2 != b2) {      // 数字のみ一致した場合
        	System.out.println("数：一致");
        	System.out.println("スート：不一致");
        	ret = false;
        	
        } else if (a1 != b1 && a2 == b2) {      //スートのみ一致した場合
        System.out.println("数：不一致");
    	System.out.println("スート：一致");
    		ret = false;
    		
        } else if (a1 != b1 && a2 != b2) {       //両方不一致の場合
        	System.out.println("数：不一致");
        	System.out.println("スート：不一致");
        	ret = false;
        	
        }
        return ret;
    }


}
 