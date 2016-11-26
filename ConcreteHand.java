package casino;

public class ConcreteHand  implements Hand{
	
	private Card[] cards;
	

	public ConcreteHand(int n){
		
		//TODO you will need to initialise the cards variable with an array of size n
		cards = new Card[n];
		
		for(int i =0; i<n;i++){
			cards[i] = null;
		}
		
		
	}
	
	
	/*
	 * This method adds a Card to the cards array
	 */
	
	public void addCard(Card card){
		
		//TODO you need to insert a Card to the array
		//You'll need to have kept track of how many cards have been added already
		//so that you add the card in the right place (i.e. immediately after the last added one)
		for(int i=0;i <cards.length;i++){
			
		if(cards[i] == null){
			cards[i] = card;
			break;
		}
	
		}
	}
	
	/*
	 * This method prints out the hand
	 * e.g. Ace of Clubs, 3 of Diamonds, Jack of Hearts, etc
	 */
	
	public void show() {
		
		System.out.println("HAND: <");
		for(int i = 0 ; i<cards.length;i++){
			if(cards[i] != null){
			System.out.println(cards[i].toString() + ",");
		}
		}
		System.out.println(">\n");
		
	}

}
