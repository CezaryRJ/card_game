package card_game;

public class player {

	public String name;
	card[] hand;
	int hand_max_size;
	private int currentSize = 0;
	public player(String name, int max_hand_size) {
		this.name = name;
		hand = new card[max_hand_size];
	}
	
	public void addCard(card inn){
		hand[currentSize] = inn;
		currentSize++;
		
		
	}
	
	public card[] getHand(){
		return hand;
	}
}
