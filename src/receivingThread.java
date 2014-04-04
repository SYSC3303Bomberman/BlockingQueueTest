import java.util.concurrent.BlockingQueue;


public class receivingThread extends Thread {
	
	BlockingQueue<Integer> q;
	
	public receivingThread(BlockingQueue<Integer>q) {
		this.q=q;
	}

	public void run(){
		int log[] = new int[50000];
		try {
			for(int i = 0; i<50000; i++){
				log[i] = q.take();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int t1 = 0, t2 = 0;
		for(int i = 0; i<50000; i++){
			if (i%100 == 0 && i!=0)
				System.out.print("\n");
			System.out.print(log[i]);
			if(log[i]==1)
				t1++;
			if(log[i]==2)
				t2++;
		}
		System.out.print("\n" + t1 + " items received from t1.");
		System.out.print("\n" + t2 + " items received from t2.");
	}
}//
