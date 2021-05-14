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
			int j=0;
			while(j<Flag.YELLOW_LENGHT) {
				j++;
				synchronized(flagui) {
					flagui.move(flag.getRowYellow(), flag.getColYellow());
					flagui.fillFlag(Flag.YELLOW_COLOR);
				}
				flag.setRowYellow(flag.getRowYellow()+1);
				try {
					sleep(sleep);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			flag.advanceColYellow();
			flag.setRowYellow(Flag.ROW_YELLOW);

		}
		
	}

}
