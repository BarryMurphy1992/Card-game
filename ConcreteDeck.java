package casino;



public class ConcreteDeck  implements Deck{

	private Card[] cards = null; 
	int discarded =0;
	
	/*
	 * public Constructor with arguments.
	 */
	public ConcreteDeck() {
		//TODO initialise the cards array (size 52)
		//then insert a new unique (and valid) Card for each of the array slots
		//Your deck can't include duplicates
		cards =new Card[52];
	
	
		//for(int i = 0; i<4 ; i++){
			for(int k = 0; k<13 ; k++){
				cards[k]= new Card (0,k);
				//System.out.println(cards[k]);
			}
			for(int k = 13; k<26 ; k++){
				cards[k]= new Card (1,k-13);
				//System.out.println(cards[k]);
			}
			for(int k = 26; k<39 ; k++){
				cards[k]= new Card (2,k-26);
				//System.out.println(cards[k]);
			}
			for(int k = 39; k<52 ; k++){
				cards[k]= new Card (3,k-39);
				//System.out.println(cards[k]);
			}
			
		//}
	} 

	
	/*
	 * returns a String representation of the array of Card
	 * e.g Ace of Clubs, Two of Clubs, Three of Clubs,..
	 */
	public String toString(){
		return null;
	}
	
	
	@Override
	public void shuffle(){
		//TODO 
		//To get a random position in the deck you could use the math.random() function
		int pos1 = (int)(Math.random()*52);
		int pos2 = (int)(Math.random()*52);
		Card temp = cards[pos1];
		
		cards[pos1]= cards[pos2];
		cards[pos2] = temp;
		
		
		
	}
	
	
	@Override
	public Card removeTopCard(){
		
		Card card = cards[0];
		discarded++;
			
		
		
		for( int i =0 ;i<52 -discarded ;i++){
			
			cards[i] = cards[i+1];
			
		}
		//System.out.println(card);
		
		return card;
	}
	
}


