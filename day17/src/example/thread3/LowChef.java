package example.thread3;

public class LowChef implements Runnable {

	@Override
	public void run() {
		������();
		������();
		�ع��������();
	}
	
	public void ������() {
		System.out.println("������ ������ �����մϴ�.");
		try {
			Thread.sleep(7500);
			System.out.println("������ ���� �� �������ϴ�.");
		}catch(Exception e) {}
	}
	
	public void ������() {
		System.out.println("������ ��Ḧ �����ϱ� �����մϴ�.");
		try {
			Thread.sleep(3000);
			System.out.println("������ ��Ḧ �� �����߽��ϴ�.");
		}catch(Exception e) {}
	}

	public void �ع��������() {
		System.out.println("������ �ع����� ����� �����մϴ�.");
		try {
			Thread.sleep(3000);
			System.out.println("������ �ع����� �� ��������ϴ�.");
		}catch(Exception e) {}
	}

}
