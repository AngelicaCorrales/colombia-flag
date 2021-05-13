package ui;

import model.Flag;
import thread.YellowThread;

public class Main {
	public final static String ESC   = "\u001b[";
	public final static String DOWN  = ESC+"B";
	
	
	public static void main(String[] args) {
		Flag flag=new Flag();
		FlagUI flagui=new FlagUI(flag);
		
		YellowThread yellow=new YellowThread(flag, flagui,500);
		yellow.start();
		
	}

}
