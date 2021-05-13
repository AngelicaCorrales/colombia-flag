package ui;

import model.Flag;

public class FlagUI {
	private Flag flag;

	public FlagUI(Flag flag) {
		this.flag=flag;
	}
	
	public void fillFlag(String str){
		
		System.out.println(str);
	}

	public Flag getFlag() {
		return flag;
	}
}
