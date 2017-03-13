package card_game;

public class board {
	//amount of card allowed on the board at any given time
	private int cardSize;
	//amount of player needed to start a game
	private int playerSize;
	
	private int currentPlayer = 0;

	private player[] players = new player[playerSize];
	
	private deck deck ;
	
	public board(int cardSize, int playerSize, deck deck) {
		this.cardSize = cardSize;
		this.playerSize = playerSize;
		this.deck = deck;
	}
	
	public void setPlayerSize(int size){
		playerSize = size;
		
	}
	public void setCardSize(int size){
		cardSize = size;
		
	}
	public player getCurrentPlayer(){
		
		return players[currentPlayer];
	}

	public deck getDeck(){
		return deck;
	}
}
