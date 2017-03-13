package card_game;

import java.util.ArrayList;

public class card {
	ArrayList<String> picture = new ArrayList<>();

	public enum color {
		spade, club, heart, diamond
	};

	public enum value {
		V2, V3, V4, V5, V6, V7, V8, V9, V10, king, queen, jack, joker, ace
	};

	public color color;
	public value value;

	public card(color color, value value) {
		this.color = color;
		this.value = value;

	}
	public void addPicLine(String inn){
		picture.add(inn);
		
	}
	
	public void print(){
		for(int i = 0; i< picture.size(); i++){
			System.out.println(picture.get(i));
			
		}
	}

}
