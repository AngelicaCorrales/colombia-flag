package ui;

import model.Flag;

public class FlagUI {
	private Flag flag;
	public final static String ESC   = "\u001b[";
	
	public FlagUI(Flag flag) {
		this.flag=flag;
	}
	
	public void clearScreen() {
		System.out.print(ESC+"2J");
		System.out.print(ESC+"0G"+ESC+"0d");
	}
	
	public void fillFlag(int textFormat) {
		System.out.print(ESC+textFormat+"m"+Flag.CH);
	}
	
	public void move(int posX, int posY){
		System.out.print(ESC+posX+";"+posY+"H");
	}

	public Flag getFlag() {
		return flag;
	}
}
