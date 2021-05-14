package model;

public class Flag {
	public final static char CH=' ';
	public final static int WIDTH=100;
	
	//Yellow
	private int colYellow;
	private int rowYellow;
	public final static int ROW_YELLOW=1;
	public final static int YELLOW_LENGHT=10;
	public final static int YELLOW_COLOR=43;
	
	//Blue
	private int colBlue;
	private int rowBlue;
	public final static int ROW_BLUE=11;
	public final static int BLUE_LENGHT=6;
	public final static int BLUE_COLOR=44;
	
	//Red
	private int colRed;
	private int rowRed;
	public final static int ROW_RED=17;
	public final static int RED_LENGHT=6;
	public final static int RED_COLOR=41;
	
	public Flag() {
		colYellow=1;
		colBlue=1;
		colRed=1;
		rowYellow=ROW_YELLOW;
		rowBlue=ROW_BLUE;
		rowRed=ROW_RED;
		
	}
	public int getRowYellow() {
		return rowYellow;
	}
	public int getRowBlue() {
		return rowBlue;
	}
	public int getRowRed() {
		return rowRed;
	}
	public void advanceColYellow() {
		colYellow++;
	}
	
	public void advanceColBlue() {
		colBlue++;
	}
	
	public void advanceColRed() {
		colRed++;
	}
		
	public int getColYellow() {
		return colYellow;
	}
	public int getColBlue() {
		return colBlue;
	}
	public int getColRed() {
		return colRed;
	}
	public void setRowYellow(int rowYellow) {
		this.rowYellow = rowYellow;
	}
	public void setRowBlue(int rowBlue) {
		this.rowBlue = rowBlue;
	}
	public void setRowRed(int rowRed) {
		this.rowRed = rowRed;
	}
	
}
