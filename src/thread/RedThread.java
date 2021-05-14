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
			i++;
			int j=0;
			while(j<Flag.RED_LENGHT) {
				j++;
				synchronized(flagui) {
					flagui.move(flag.getRowRed(), flag.getColRed());
					flagui.fillFlag(Flag.RED_COLOR);
				}
				flag.setRowRed(flag.getRowRed()+1);
				try {
					sleep(sleep);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			flag.advanceColRed();
			flag.setRowRed(Flag.ROW_RED);
		}
	}

}
