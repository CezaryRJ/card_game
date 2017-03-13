package rules;

import card_game.board;
import card_game.ruleInter;

public class drawCard implements ruleInter {

	//make the current player draw an amount of cards
	private int amount;

	@Override
	public boolean checkRule(board board) {
		for (int i = 0; i < amount; i++) {
			board.getCurrentPlayer().addCard(board.getDeck().getCard());
		}
		return true;
	}

	public drawCard(int amount) {
		this.amount = amount;

	}
}
