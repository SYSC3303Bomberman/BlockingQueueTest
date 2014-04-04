import java.util.concurrent.BlockingQueue;


public class receivingThread extends Thread {
	
	BlockingQueue<Integer> q;
	
	public receivingThread(BlockingQueue<Integer>q) {
		this.q=q;
	}

	public void run(){
		int log[] = new int[50];
		try {
			for(int i = 0; i<50; i++){
				log[i] = q.take();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i<50; i++){
			if (i%25 == 0 && i!=0)
				System.out.print("\n");
			System.out.print(log[i]);
			
		}
	}
}
