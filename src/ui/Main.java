package ui;

import model.Flag;
import thread.YellowThread;

public class Main {
	
	public static void main(String[] args) {
		Flag flag=new Flag();
		FlagUI flagui=new FlagUI(flag);
		YellowThread yellow=new YellowThread(flag, flagui,50);
		yellow.start();
		
		
	}

}
