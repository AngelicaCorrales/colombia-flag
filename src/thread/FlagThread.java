package thread;

import model.Flag;
import ui.FlagUI;

public class FlagThread extends Thread {
	private Flag flag;
	private FlagUI flagui;
	private long sleep;
	private int color;

	public FlagThread(Flag flg, FlagUI flgui, long slp,int colore) {
		flag=flg;
		flagui=flgui;
		sleep=slp;
		color=colore;
		
	}
	
	public void run() {
		int i=0;
		while(i<Flag.WIDTH) {
			i++;
			int j=0;
			while(j<Flag.LENGHTS[color]) {
				j++;
				synchronized(flagui) {
					flagui.move(flag.getRows()[color], flag.getCols()[color]);
					flagui.fillFlag(Flag.COLORS[color]);
				}
				flag.setRow(color,flag.getRows()[color]+1);
				try {
					sleep(sleep);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			flag.setCol(color,flag.getCols()[color]+1);
			
			flag.setRow(color,Flag.ROWS[color]);

		}
		
	}

}
