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
		int i=0;
		while(i<Flag.WIDTH) {
			i++;
			lineDown();
		}
	}
	
	public synchronized void lineDown() {
		int i=1;
		while(i<Flag.YELLOW_LENGHT) {
			i++;
			
			flagui.fillFlag("");
		}
	}

}
