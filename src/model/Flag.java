package model;

public class Flag {
	private int rowYellow;
	private int colYellow;
	private char ch;
	private int yellowLenght;
	private int width;
	
	public Flag() {
		ch=' ';
		rowYellow=1;
		colYellow=1;
		yellowLenght=15;
		width=200;
		
	}
	public void advanceYellow() {
		colYellow++;
		//ESC [ <y> ; <x> H
	}
	public int getColYellow() {
		return colYellow;
	}
	public char getCh() {
		return ch;
	}
	public int getRowYellow() {
		return rowYellow;
	}
	public int getYellowLenght() {
		return yellowLenght;
	}
	public int getWidth() {
		return width;
	}
}
