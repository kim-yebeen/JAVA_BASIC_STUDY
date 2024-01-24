package example.thread3;

public class HighChef implements Runnable{
	@Override
	public void run() {
		 System.out.println();
		 주찬만들기();
	}
	public void 주찬만들기() {
		System.out.println("오징어 주 메뉴를 만들기 시작합니다.");
		try 
		{
			Thread.sleep(500);
		}catch (Exception e) {	}
		System.out.println("오징어 주찬을 다 만들었습니다.");
	}
		
}
