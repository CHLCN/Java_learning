// reference: https://blog.csdn.net/xyb890826/article/details/41829627

package poker;

public class ChooseCards724 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false; // the mark of the end of the game
		boolean[] isIn = new boolean[4];
		int count = 0; 
		
		while(!flag) {
			if (isIn[0] && isIn[1] && isIn[2] && isIn[3]) {
				flag = true;
			}
			else {
				getCard(isIn);
			}
			count++;
		}
		System.out.println("Number of picks: " + count);
	}
	
	public static String getCard(boolean[] isIn) {
		int[] cardsNum = new int[52];
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		// initialize the cards
		for ( int i = 0; i < cardsNum.length; i++) {
			cardsNum[i] = i;
		}
		
		// shuffle
		for ( int i = 0 ; i < cardsNum.length; i++) {
			// get a random number between 0 and 51
			int j = (int)(Math.random()*cardsNum.length);
			int tmp = cardsNum[i];
			cardsNum[i] = cardsNum[j];
			cardsNum[j] = tmp;
		}
		
		// draw cards
		int index = (int)(Math.random()*52);
		// the suit of the chosen card
		String suit = suits[cardsNum[index] / 13];
		// the rank of the chosen card
		String rank = ranks[cardsNum[index] % 13];
		
		switch(suit) {
		case "Spades":
			if(!isIn[0]) {
				System.out.println(rank+" of " + suit);
				isIn[0] = true;
			}
			break;
		case "Hearts":
			if(!isIn[1]) {
				System.out.println(rank+" of " + suit);
				isIn[1] = true;
			}
			break;
		case "Diamonds":
			if(!isIn[2]) {
				System.out.println(rank+" of " + suit);
				isIn[2] = true;
			}
			break;
		case "Clubs":
			if(!isIn[3]) {
				System.out.println(rank+" of " + suit);
				isIn[3] = true;
			}
			break;
		}
		
		return rank;
	}

}
