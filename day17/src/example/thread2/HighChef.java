package example.thread2;

public class HighChef {

	public void ���������() {
		System.out.println("��¡�� �� �޴��� ����� �����մϴ�.");
		try 
		{
			Thread.sleep(500);
		}catch (Exception e) {	}
		System.out.println("��¡�� ������ �� ��������ϴ�.");
	}
	
	public void �������׸���ϱ�() {
		MiddChef mcf = new MiddChef();
		mcf.�θ޴������();
		mcf.�����̱�();
		
		LowChef lcf = new LowChef();
		lcf.������();
		lcf.������();
		lcf.�ع��������();
	}
}
