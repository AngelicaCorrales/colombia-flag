package thread;

import model.Flag;
import ui.FlagUI;

public class BlueThread extends Thread {
	private Flag flag;
	private FlagUI flagui;
	private long sleep;

	public BlueThread(Flag flg, FlagUI flgui, int slp) {
		flag=flg;
		flagui=flgui;
		sleep=slp;
		
	}
	
	public void run() {
		int i=0;
		while(i<Flag.WIDTH) {
			synchronized(flagui) {
				i++;		

				flagui.moveRight(Flag.BLUE_COLOR, Flag.ROW_BLUE, flag.getColBlue());
				flagui.fillFlag(Flag.BLUE_COLOR);
				try {
					sleep(sleep);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
				flag.advanceBlue();

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
		while(i<Flag.BLUE_LENGHT) {
			i++;
			flagui.moveDown(Flag.BLUE_COLOR);
			flagui.fillFlag(Flag.BLUE_COLOR);
			try {
				sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
