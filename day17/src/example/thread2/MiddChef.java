package example.thread2;

public class MiddChef {

	public void 부메뉴만들기() {
		System.out.println("센터가 부메뉴 만들기를 시작합니다.");
		try 
		{
			Thread.sleep(3500);	
		}catch (Exception e) {}
	}
	
	public void 국끌이기() {
		System.out.println("센터가 국끓이기를 시작합니다.");
		try 
		{
			Thread.sleep(3500);			
		}catch (Exception e) {}
	}
}
