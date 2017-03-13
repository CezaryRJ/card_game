package card_game;

public class deck {
	int size;
public int index = 0;
	public card[] deck;

	public deck(int size) {
		this.size = size;
		deck = new card[size];
	}
	
	public void shuffle(){
		
	}
	public card getCard(){
		
		return deck[0];
	}
	public void addCard(card newCard){
		deck[index] = newCard;
		index++;
	}

}
