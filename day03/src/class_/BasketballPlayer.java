package class_;

public class BasketballPlayer {

	public String name; //�󱸼����� �̸�
	public int height; //Ű
	public int age; //����
	public int salary; //����
	
	
	//�����ڴ� ����Ÿ���� ����, Ŭ������� ������ �̸����� �޼��带 �����ϸ� �ȴ�.
	public BasketballPlayer(String n, int h, int a, int s ) {
		name=n;
		height =h;
		age = a;
		salary = s;
	}
	//showInfo�� �ۼ��ϰ�, ȣ�� �� ���� 4�� ������ �ֿܼ� �ﵵ�� �ۼ�
	
	public void showInfo() {
		System.out.println("�󱸼����� �̸� :" + name);
		System.out.println("�󱸼����� Ű :" + height);
		System.out.println("�󱸼����� ���� :" + age);
		System.out.println("�󱸼����� ���� :" + salary);
		
	}
	
	public void dunkShoot() { //��ũ���ϱ� ���
		if(height > 190) {
			System.out.println("��ũ�� ����!");
		}
		else {
			System.out.println("��뿡 ���� ����");
		}
	}
}
