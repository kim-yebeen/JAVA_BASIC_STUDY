package example.thread4;

public class ThreadNotSafety2 extends Thread {
	
	static int share;
	
	public static void main(String[] args) {
		ThreadNotSafety2 t1 = new ThreadNotSafety2();
		ThreadNotSafety2 t2= new ThreadNotSafety2();
		
		t1.start();
		t2.start();
	}
	
	//������ ������ ���ؼ� ����ϴ� �޼��� 
	//synchronized Ű���带 ���� ���ü� ���� �ذ� ����
	public synchronized static void sharePlus() {
		System.out.println(share++);
	}
	
	@Override
	public void run() {
		for(int count =0;count<10;count++) {
			sharePlus();//���ü� ��� �Ǵ� �޼���� 1�� ����
			try {Thread.sleep(10);} 
			catch (Exception e) {}
		}
	}

}
