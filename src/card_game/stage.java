package card_game;

import java.util.ArrayList;
import java.util.HashMap;

public class stage {

	board board;

	stage(board board) {
		this.board = board;

	}
	
	//the first stage transition to have all its conditions met will trigger its stage
	//check should be ran after every valid action
	ArrayList<stageTrans> stages = new ArrayList<>();
	
	
	// ran at the start of a turn
	ArrayList<actionInter> start_of_turn_rules = new ArrayList<>();
	
	//the rules for this stage, all must return true for an action to be valid
	ArrayList<ruleInter> stage_rules = new ArrayList<>();
	// ran at the end of a turn
	ArrayList<actionInter> end_of_turn_rules = new ArrayList<>();

	

	public void start() {
		for (int i = 0; i < start_of_turn_rules.size(); i++) {
			start_of_turn_rules.get(i).performAction();

		}

	}


	public void addStartAction(ruleInter inn) {
		start_of_turn_rules.add(new action(board));
		start_of_turn_rules.get(start_of_turn_rules.size()).addRule(inn);
	}

	public void addEndingAction(ruleInter inn) {
		end_of_turn_rules.add(new action(board));
		end_of_turn_rules.get(end_of_turn_rules.size()).addRule(inn);
	}
}


/*
------------
| 2        |
|          |
|    /\    |
|    \/    |
|          |
|        2 |
------------

------------
| 2        |
|          |
|   /\/\   |
|   \  /   |
|    \/    |
|        2 |
------------

------------
| 2        |
|          |
|    ()    |
|  ()__()  |	
|    ||    |
|        2 |
------------ 

------------
| 2        |
|          |
|    /\    |
|  (    )  |
|    ||    |          
|        2 |
------------
  	
  
*/
