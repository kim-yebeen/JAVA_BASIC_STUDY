package example.thread2;

public class MainClass {
	public static void main(String[] args) {
		
		//오장 객체 생성 후 할일을 호출하면
		//오장 객체가 다시 센터랑 막내에게 일을 시키고 자기도 할일을 해야하는데
		//멀티 쓰레드 환경이 아니기 때문에 한 번에 한 객체만 일을 한다.
		HighChef hcf= new HighChef();
		hcf.후임한테명령하기();
		hcf.주찬만들기();
	}

}
