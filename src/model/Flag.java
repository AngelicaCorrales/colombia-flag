package model;

public class Flag {
	public final static char CH=' ';
	public final static int WIDTH=50;
	
	private int colYellow;
	public final static int ROW_YELLOW=1;
	public final static int YELLOW_LENGHT=10;
	public final static int YELLOW_COLOR=43;
	
	private int colBlue;
	public final static int ROW_BLUE=12;
	public final static int BLUE_LENGHT=6;
	public final static int BLUE_COLOR=44;
	
	public Flag() {
		colYellow=1;
		colBlue=1;
		
	}
	public void advanceYellow() {
		colYellow++;
	}
	
	public void advanceBlue() {
		colBlue++;
	}
	public int getColYellow() {
		return colYellow;
	}
	public int getColBlue() {
		return colBlue;
	}
	
}
