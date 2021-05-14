package ui;

import model.Flag;
import thread.BlueThread;
import thread.RedThread;
import thread.YellowThread;

public class Main {
	
	public static void main(String[] args) {
		Flag flag=new Flag();
		FlagUI flagui=new FlagUI(flag);
		flagui.clearScreen();
		YellowThread yellow=new YellowThread(flag, flagui,25);
		BlueThread blue=new BlueThread(flag, flagui,50);
		RedThread red=new RedThread(flag, flagui,100);
		yellow.start();
		blue.start();
		red.start();
		
		
	}

}
