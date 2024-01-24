package example.thread4;

public class ThreadNotSafety extends Thread {

	static int share;
	public static void main(String[] args) {
		ThreadNotSafety t1 = new ThreadNotSafety();
		ThreadNotSafety t2 = new ThreadNotSafety();
	
		t1.start();
		t2.start();
	}
	@Override
	public void run() {
		for(int count=0; count<10; count++) {
			System.out.println(share++);
		
			try { Thread.sleep(2000);
			} catch (Exception e) {	}
		}
	}
}
