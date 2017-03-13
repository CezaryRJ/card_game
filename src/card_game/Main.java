package card_game;

import card_game.card.color;
import card_game.card.value;
import deckPresets.classicDeck;
import rules.drawCard;

public class Main {

	public static void main(String[] args) {

		card test = new card(color.club,value.ace);
		test.addPicLine("------------");
		test.addPicLine("| 2        |");
		test.addPicLine("|          |");
		test.addPicLine("|    /\\    |");
		test.addPicLine("|    \\/    |");
		test.addPicLine("|          |");
		test.addPicLine("|        2 |");
		test.addPicLine("------------");
		
		test.print();

		stage aaa = new stage(new board(4, 4, new classicDeck()));
		
		aaa.stage_rules.add(new drawCard(5));
		
	}

}
