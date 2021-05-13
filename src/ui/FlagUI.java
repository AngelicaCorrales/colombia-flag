package ui;

import model.Flag;

public class FlagUI {
	private Flag flag;
	public final static String ESC   = "\u001b[";
	public final static String DOWN  = ESC+"B";
	public final static String LEFT  = ESC+"D";

	public FlagUI(Flag flag) {
		this.flag=flag;
	}
	public void clearScreen() {
		System.out.print(ESC+"2J");
		System.out.print(ESC+"0G"+ESC+"0d");
	}
	
	public void moveDown(int textFormat){
		System.out.print(DOWN);
		System.out.print(LEFT);		
	}
	
	public void fillFlag(int textFormat) {
		System.out.print(ESC+textFormat+"m"+Flag.CH);
	}
	public void moveRight(int textFormat, int posX, int posY){
		System.out.print(ESC+posX+";"+posY+"H");
			
	}

	public Flag getFlag() {
		return flag;
	}
}
