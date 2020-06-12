package Minipro2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CardGame {
	//HardCardMaster hardCardMaster;
	//EasyCardMaster easyCardMaster;
	private CardMaster cardMaster;
	
	
	public CardGame() {
		
	}
	
	public void start(CardStack stack) {
        this.chooseCardMaster(stack);
        cardMaster.drawAnswerCard();
        boolean end = false;
        do {
            int a = this.promptInputNumber();
            Suit b =this.promptInputSuit();
            Card card = new Card(a, b);
            end = cardMaster.judge(card);
        } while(end == false);
    }
	
	public void chooseCardMaster(CardStack stack) {
		int inCardMaster = 0;
		System.out.println("審判を選んでください");
		System.out.println("入力例 : 1:厳しい審判, 2:やさしい審判 ");
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
	public int promptInputNumber() {
		int inNumber; 
		System.out.println("数(1～13)を入力してください");
		while(true){
			try{
				Scanner scanner = new Scanner(System.in);
				inNumber = scanner.nextInt();
				if((Card.MIN <= inNumber) && inNumber <= Card.MAX){
					break;
				}else{
					System.out.println("数を1～13の範囲で入力してください");
				}
			}catch(NumberFormatException e){
				System.out.println("数値(1～13)を入力してください");
			}
		}
		System.out.println();
		return inNumber;
		}
	
	
	
	public Suit promptInputSuit(){
		
		System.out.println("スートを入力してください。");
		System.out.println("0:スペード, 1:ハート, 2:ダイヤ, 3:クラブ ");
		while(true){
			int inSuit= 0;
			Scanner scanner = new Scanner(System.in);
			inSuit = scanner.nextInt();
			
			if(inSuit == 0) {
				return Suit.SPADE;
			} else if(inSuit == 1) {
			    return Suit.HEART;
			} else if(inSuit == 2) {
				return Suit.DIA;
			} else if (inSuit == 3) {
				return Suit.CLOVER;
			} else {
				System.out.println("スートを0～3の数字で入力してください。");
				continue;
			}
			
		}

	}
	{

	}
	
}