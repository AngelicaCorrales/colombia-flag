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
		flagui.clearScreen();
		flagui.fillFlag(Flag.YELLOW_COLOR);
		int i=0;
		while(i<Flag.WIDTH) {
			i++;		
			
			flagui.moveRight(Flag.YELLOW_COLOR, Flag.ROW_YELLOW, flag.getColYellow());
			flagui.fillFlag(Flag.YELLOW_COLOR);
			flag.advanceYellow();
			lineDown();
			try {
				sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void lineDown() {
		
		int i=0;
		while(i<Flag.YELLOW_LENGHT) {
			i++;
			flagui.moveDown(Flag.YELLOW_COLOR);
			flagui.fillFlag(Flag.YELLOW_COLOR);
			try {
				sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
