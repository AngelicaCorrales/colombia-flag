package thread;

import model.Flag;
import ui.FlagUI;

public class YellowThread extends Thread {
	private Flag flag;
	private FlagUI flagui;
	private long sleep;

	public YellowThread(Flag flg, FlagUI flgui, int slp) {
		flag=flg;
		flagui=flgui;
		sleep=slp;
		
	}
	
	public void run() {
		while(true) {
			
		}
	}
	
	public synchronized void lineDown() {
		while(true) {

		}
	}

}
