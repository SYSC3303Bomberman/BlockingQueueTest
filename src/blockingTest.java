import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class blockingTest {

	public static void main(String[] args) {
		BlockingQueue<Integer> q = new LinkedBlockingQueue<Integer>();
		sendingThread prod1 = new sendingThread(q,1);
		sendingThread prod2 = new sendingThread(q,2);
		receivingThread cons1 = new receivingThread(q);
		cons1.start();
		prod1.start();
		prod2.start();

	}

}
