package model;

public class Flag {
	public final static char CH=' ';
	public final static int WIDTH=100;
	
	
	//Yellow, blue, red
	public final static int[]ROWS= new int[] {1,11,17};
	public final static int[]LENGHTS= new int[] {10,6,6};
	public final static int[]COLORS= new int[] {43,44,41};
	private int[] cols;
	private int[] rows;
	
	
	
	public Flag() {
		cols=new int[] {1,1,1};
		rows=new int[] {ROWS[0],ROWS[1],ROWS[2]};
		
		
	}
	
	public int[] getCols() {
		return cols;
	}
	
	public void setCol(int i,int col) {
		cols[i]=col;
	}
	public int[] getRows() {
		return rows;
	}
	public void setRow(int i,int row) {
		rows[i]=row;
	}
	
}
