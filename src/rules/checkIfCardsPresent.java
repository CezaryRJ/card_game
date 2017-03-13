package rules;

import card_game.board;
import card_game.card;
import card_game.ruleInter;

public class checkIfCardsPresent implements ruleInter {
	card[] combination;
	String name;
	@Override
	public boolean checkRule(board board) {

		int counter = 0;
		for (int x = 0; x < combination.length; x++) {

			for (int i = 0; i < board.getCurrentPlayer().getHand().length; i++) {
				if (combination[x] == board.getCurrentPlayer().getHand()[i]) {
					counter++;
				}

			}
		}
		if (counter == combination.length) {
			return true;
		}
		return false;
	}

	public checkIfCardsPresent(card[] combination, String name) {
		this.combination = combination;
		this.name = name;

	}

}
