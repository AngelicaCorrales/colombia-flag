package model;

public class Flag {
	public final static int ROW_YELLOW=1;;
	private int colYellow;
	public final static char CH=' ';
	public final static int YELLOW_LENGHT=15;
	public final static int WIDTH=200;
	public final static int YELLOW_COLOR=104;
	
	public Flag() {
		colYellow=1;		
		
	}
	public void advanceYellow() {
		colYellow++;
		//ESC [ <y> ; <x> H
	}
	public int getColYellow() {
		return colYellow;
	}
	
}
