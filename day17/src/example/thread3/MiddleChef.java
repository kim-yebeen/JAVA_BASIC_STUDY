package example.thread3;

public class MiddleChef implements Runnable {

	@Override
	public void run() {
		���������();
		�����̱�();
	}
	
	public void ���������() {
		System.out.println("���Ͱ� ���� ���̱� �����մϴ�.");
		try {
			Thread.sleep(5000);
			System.out.println("���Ͱ� ���� �� �������ϴ�.");
		}catch(Exception e) {}
	}
	
	public void �����̱�() {
		System.out.println("���Ͱ� ������ ����� �����մϴ�.");
		try {
			Thread.sleep(6000);
			System.out.println("���Ͱ� ������ �� ��������ϴ�.");
		}catch(Exception e) {}
	}
	
	

}
