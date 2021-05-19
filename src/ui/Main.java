package ui;

import model.Flag;
import thread.FlagThread;

public class Main {
	
	public static void main(String[] args) {
		Flag flag=new Flag();
		FlagUI flagui=new FlagUI(flag);
		flagui.clearScreen();
		
		
		FlagThread yellow=new FlagThread(flag, flagui,15,0);
		FlagThread blue=new FlagThread(flag, flagui,30,1);
		FlagThread red=new FlagThread(flag, flagui,50,2);
		yellow.start();
		blue.start();
		red.start();
				
	}

}
