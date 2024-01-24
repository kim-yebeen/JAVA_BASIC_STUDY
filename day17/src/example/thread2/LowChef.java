package example.thread2;

public class LowChef {

	public void 밑반찬만들기() {
		System.out.println("막내가 밑반찬을 만들기를 시작합니다.");
		try 
		{
			Thread.sleep(3500);
		}catch (Exception e) {}
	}

	public void 밥짓기() {
		System.out.println("막내가 밥 만들기를 시작합니다.");
		try 
		{
			Thread.sleep(3500);	
		}catch (Exception e) {}
	}

	public void 재료손질() {
		System.out.println("막내가 재료손질을 시작합니다.");
		try 
		{
			Thread.sleep(3500);
		}catch (Exception e) {}	
	}
}
