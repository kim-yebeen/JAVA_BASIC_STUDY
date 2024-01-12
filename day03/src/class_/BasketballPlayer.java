package class_;

public class BasketballPlayer {

	public String name; //농구선수의 이름
	public int height; //키
	public int age; //나이
	public int salary; //연봉
	
	
	//생성자는 리턴타입이 없고, 클래스명과 동일한 이름으로 메서드를 정의하면 된다.
	public BasketballPlayer(String n, int h, int a, int s ) {
		name=n;
		height =h;
		age = a;
		salary = s;
	}
	//showInfo를 작성하고, 호출 시 위의 4개 변수를 콘솔에 찍도록 작성
	
	public void showInfo() {
		System.out.println("농구선수의 이름 :" + name);
		System.out.println("농구선수의 키 :" + height);
		System.out.println("농구선수의 나이 :" + age);
		System.out.println("농구선수의 연봉 :" + salary);
		
	}
	
	public void dunkShoot() { //덩크슛하기 기능
		if(height > 190) {
			System.out.println("덩크슛 성공!");
		}
		else {
			System.out.println("골대에 닿지 않음");
		}
	}
}
