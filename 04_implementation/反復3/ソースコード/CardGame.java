package mini2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CardGame {
	//HardCardMaster hardCardMaster;
	//EasyCardMaster easyCardMaster;
	private CardMaster cardMaster;
	private ArrayList<Card> turn = new ArrayList<Card>();
	
	public CardGame() {
		
	}
	
	 public void start(CardStack stack) {
	        this.chooseCardMaster(stack);
	        cardMaster.drawAnswerCard(); 
	        boolean end = false;
	        System.out.println("");
	        System.out.println("数とスートを入力してください");
	        System.out.println("---");
	        System.out.println("* 入力例 : 数 [半角スペース] スート ");
	        System.out.println("【スートの入力 】 0:スペード, 1:ハート, 2:ダイヤ, 3:クラブ ");
	        System.out.println("---");
	        do {
	            
	        	this.showTurn();
	        	int[] temporaryCard = promptInput();
	            int a = temporaryCard[0];
	            Suit b =this.changeSuit(temporaryCard);
	            Card card = new Card(a, b);
	            turn.add(card);
	            end = cardMaster.judge(card);
	        } while(end == false);
	        this.showWinner();
	    }
	    
	    public void chooseCardMaster(CardStack stack) {
	        int inCardMaster = 0;
	        System.out.println("審判を選んでください");
	        System.out.println("---");
	        System.out.println("*入力例 : 1:厳しい審判, 2:やさしい審判 ");
	        while(true) {
	        Scanner scanner = new Scanner(System.in);
	        inCardMaster = scanner.nextInt();
	        if(inCardMaster == 1) {
	            this.cardMaster = new HardCardMaster(stack);
	            break;
	        } else if (inCardMaster == 2) {
	            this.cardMaster = new EasyCardMaster(stack);
	            break;
	        } else {
	            System.out.println("1か2を入力してください。");
	            continue;
	        }
	        }
	    }
	    public int[] promptInput() {
	        int inNumber;
	        int inSuit;
	        while(true){
	            try{
	                Scanner scanner = new Scanner(System.in);
	                inNumber = scanner.nextInt();
	                inSuit = scanner.nextInt();
	                if(((Card.MIN <= inNumber) && (inNumber <= Card.MAX))&&(0 <= inSuit && inSuit <= 3)){
	                    break;
	                }else{
	                    System.out.println("数を1～13、スートを0～3の範囲で入力してください");
	                }
	            }catch(NumberFormatException e){
	                System.out.println("数値(0～13)を入力してください");
	            }
	        }
	        System.out.println();
	        int[] temporaryCard = new int[2];
	        temporaryCard[0] = inNumber;
	        temporaryCard[1] = inSuit;
	        return temporaryCard;
	        }
	    
	    
	    
	    public Suit changeSuit(int[] temporaryCard){
	        Suit suit = null;
	        int a = temporaryCard[1];
	        switch(a) {
	        case 0:
	            suit = Suit.SPADE;
	            break;
	        case 1:
	            suit = Suit.HEART;
	            break;
	        case 2:
	            suit = Suit.DIA;
	            break;
	        case 3:
	            suit = Suit.CLOVER;
	            break;
	        default:
	            //ここは通らない
	        }
	        return suit;
	    }
	
	
	public void showTurn() {
		System.out.println(" ");
		System.out.println("--------------------");
		if(turn.size() % 2 == 0) {
			System.out.println("先攻のターンです");
		} else {
			System.out.println("後攻のターンです");
		}
	}
	
	
	public void showWinner() {
		if(turn.size() % 2 == 1) {
			System.out.println("先攻の勝利");
		} else {
			System.out.println("後攻の勝利");
		}
	}
	
	
}