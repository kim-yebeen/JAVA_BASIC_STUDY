package example.thread4;

public class ThreadNotSafety2 extends Thread {
	
	static int share;
	
	public static void main(String[] args) {
		ThreadNotSafety2 t1 = new ThreadNotSafety2();
		ThreadNotSafety2 t2= new ThreadNotSafety2();
		
		t1.start();
		t2.start();
	}
	
	//쓰레드 안전을 위해서 사용하는 메서드 
	//synchronized 키워드를 통해 동시성 문제 해결 가능
	public synchronized static void sharePlus() {
		System.out.println(share++);
	}
	
	@Override
	public void run() {
		for(int count =0;count<10;count++) {
			sharePlus();//동시성 제어가 되는 메서드로 1씩 증가
			try {Thread.sleep(10);} 
			catch (Exception e) {}
		}
	}

}
