package has_a;

public class MainClass {
	
	public static void main(String[] args) {
		//Gun�� new Ű����� �����ؾ� police �����ڿ� ���� ����
		Gun gun =new Gun("m-16","369858");
		
		//gun�� ������ �������� ������ �ѱ� ����� ����
		Police police = new Police(gun, "������", 180);
		
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
