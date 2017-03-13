package card_game;

import java.util.ArrayList;

public class action implements actionInter{
	
	public board board;
	public action(board board){
		this.board = board;
		
	}
	
	ArrayList<ruleInter> actionrules = new ArrayList<>();

	@Override
	public void performAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayError() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRule(ruleInter rule) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkIfValidAction() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	

}
