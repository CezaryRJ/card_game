package rules;

import card_game.board;
import card_game.ruleInter;

public class assignBoardCardCount implements ruleInter{
int size;
	@Override
	public boolean checkRule(board board) {
		board.setCardSize(size);
		return true;
	}

	public assignBoardCardCount(int size){
		this.size = size;
	}
}
