package thread;

import model.Flag;
import ui.FlagUI;

public class RedThread extends Thread{
	private Flag flag;
	private FlagUI flagui;
	private long sleep;

	public RedThread(Flag flg, FlagUI flgui, int slp) {
		flag=flg;
		flagui=flgui;
		sleep=slp;
		
	}
	
	public void run() {
		int i=0;
		while(i<Flag.WIDTH) {
			synchronized(flagui) {
				i++;		

				flagui.moveRight(Flag.RED_COLOR, Flag.ROW_RED, flag.getColRed());
				flagui.fillFlag(Flag.RED_COLOR);
				try {
					sleep(sleep);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
				flag.advanceRed();

				lineDown();
			}
			try {
				sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}

	public void lineDown() {

		int i=0;
		while(i<Flag.RED_LENGHT) {
			i++;
			flagui.moveDown(Flag.RED_COLOR);
			flagui.fillFlag(Flag.RED_COLOR);
			try {
				sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
