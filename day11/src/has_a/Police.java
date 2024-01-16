package has_a;

public class Police {

	//��� ���� Gun ����� ����ϱ� ���� ��������� Gun�� �����ϴ�.
	private Gun gun;
	private String name;
	private int height;
	
	public Police(Gun gun, String name, int height) {
		this.gun=gun;
		this.name=name;
		this.height=height;
	}
	
	public void shoot() {
		this.gun.shoot();//��� �ִ� �� ��
	}
	public void showStatus() {
		System.out.println("���� �ѱ� : "+this.gun);
		System.out.println("�̸� : "+this.name);
		System.out.println("Ű : "+this.height);
	}
}
