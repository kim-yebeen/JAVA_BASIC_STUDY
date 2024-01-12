package noinheri;

public class MainClass1 {
	public static void main(String[] args) {
//전사 하나 생성
	Warrior w1 = new Warrior("리눅스개발");
	//생성 직후 정보 조회
	w1.showStatus();
	//토끼생성
	Rabbit r1= new Rabbit();
	//토끼와 교전
	w1.huntRabbit(r1);
	//죽은 토끼 한 번 더 공격해보기
	w1.huntRabbit(r1);
	//사냥 후 정보 조회
	w1.showStatus();
	//huntRat 메서드를 구현해주세요.
	//기본적 로직은 똑같고, Rabbit대신 Rat 자료형을 요구합니다.
	//Rat은 공격을 받고 죽지 않으면 1회 반격합니다.
	//경험치는 80입니다.
	//public void huntRat() {
		
	}		
	
}
