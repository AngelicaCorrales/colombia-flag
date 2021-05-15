package thread;

import model.Flag;
import ui.FlagUI;

public class BlueThread extends Thread {
	private Flag flag;
	private FlagUI flagui;
	private long sleep;

	public BlueThread(Flag flg, FlagUI flgui, long slp) {
		flag=flg;
		flagui=flgui;
		sleep=slp;
		
	}
	
	public void run() {
		int i=0;
		while(i<Flag.WIDTH) {
			i++;
			int j=0;
			while(j<Flag.BLUE_LENGHT) {
				j++;
				synchronized(flagui) {
					flagui.move(flag.getRowBlue(), flag.getColBlue());
					flagui.fillFlag(Flag.BLUE_COLOR);
				}
				flag.setRowBlue(flag.getRowBlue()+1);
				try {
					sleep(sleep);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			flag.advanceColBlue();
			flag.setRowBlue(Flag.ROW_BLUE);

		}	
	}	
}
