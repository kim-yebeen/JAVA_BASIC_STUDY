package example.thread3;

public class HighChef implements Runnable{
	@Override
	public void run() {
		 System.out.println();
		 ���������();
	}
	public void ���������() {
		System.out.println("��¡�� �� �޴��� ����� �����մϴ�.");
		try 
		{
			Thread.sleep(500);
		}catch (Exception e) {	}
		System.out.println("��¡�� ������ �� ��������ϴ�.");
	}
		
}
