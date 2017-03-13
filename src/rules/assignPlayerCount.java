
	package rules;


	import card_game.board;
	import card_game.ruleInter;

	public class assignPlayerCount implements ruleInter{

		int count;
		
		
		public boolean checkRule(board board) {
		
			board.setPlayerSize(count);
			
			return true;
		}

		public assignPlayerCount(int count){
			this.count = count;
			
		}
	
}
