package model;

public class Flag {
	public final static int ROW_YELLOW=1;;
	private int colYellow;
	public final static char CH=' ';
	public final static int YELLOW_LENGHT=10;
	public final static int WIDTH=50;
	public final static int YELLOW_COLOR=43;
	
	public Flag() {
		colYellow=1;		
		
	}
	public void advanceYellow() {
		colYellow++;
		//ESC [ <x> ; <y> H
	}
	public int getColYellow() {
		return colYellow;
	}
	
}
