package class_;

public class BasketballPlayerMain {

	public static void main(String[] args) {
	//농구선수 2명 만든ㄹ기, 정보 조회 코드 작성
		BasketballPlayer b1 = new BasketballPlayer("이관희",180,22,500);
		//b1.name="이관희";
		//b1.age=22;
		//b1.height=180;
		//b1.salary=500;
		
		BasketballPlayer b2 = new BasketballPlayer("정광수",200,32,800);
		//b2.name="정광수";
		//b2.age=32;
		//b2.height=200;
		//b2.salary=800;
		
		b1.showInfo();
		b1.dunkShoot();
		b2.showInfo();
		b2.dunkShoot();
	}

}
