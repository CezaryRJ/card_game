package card_game;

public interface actionInter {

	void performAction();

	void displayAction();

	void displayError();
	
	void addRule(ruleInter rule);
	
	boolean checkIfValidAction();
}
