package example.thread3;

public class MultiRestaurant {

	public static void main(String[] args) {
		Runnable highR = new HighChef();
		Runnable middleR = new MiddleChef();
		Runnable lowR = new LowChef();
		
		Thread t1 = new Thread(highR);
		Thread t2 = new Thread(middleR);
		Thread t3 = new Thread(lowR);
		
		//������ �丮�簡 ���ÿ� �۾��� �մϴ�.
		t1.start();
		t2.start();
		t3.start();
	}
}
