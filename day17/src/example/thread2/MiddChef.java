package example.thread2;

public class MiddChef {

	public void �θ޴������() {
		System.out.println("���Ͱ� �θ޴� ����⸦ �����մϴ�.");
		try 
		{
			Thread.sleep(3500);	
		}catch (Exception e) {}
	}
	
	public void �����̱�() {
		System.out.println("���Ͱ� �����̱⸦ �����մϴ�.");
		try 
		{
			Thread.sleep(3500);			
		}catch (Exception e) {}
	}
}
