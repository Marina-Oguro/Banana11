package mini2;

public abstract class CardMaster {
	
	    
	    protected Card answerCard;
	    protected Card card;
	    protected CardStack stack;
	    
	    public void drawAnswerCard(){
	        this.answerCard = stack.drawCard();
	    }
	    
	    public Card getAnswerCard() {
	        return answerCard;
	    }
	    
	    public abstract boolean judge(Card card);
	    	
	 

	
}
	 