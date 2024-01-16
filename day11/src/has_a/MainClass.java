package has_a;

public class MainClass {
	
	public static void main(String[] args) {
		//Gun을 new 키워드로 생성해야 police 생성자에 전달 가능
		Gun gun =new Gun("m-16","369858");
		
		//gun을 사전에 생성하지 않으면 넘길 방법이 없음
		Police police = new Police(gun, "나경찰", 180);
		
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		
	}
}
