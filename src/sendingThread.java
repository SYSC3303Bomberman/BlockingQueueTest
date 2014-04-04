import java.util.concurrent.BlockingQueue;


public class sendingThread extends Thread{
	
	BlockingQueue<Integer> q;
	Integer e;
	
	public sendingThread(BlockingQueue<Integer> q, Integer title) {
		this.q=q;
		this.e=title;
	}

	public void run() {
		try {
			for(int i=0; i<25; i++){
				q.put(e);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
