package class_;

public class BasketballPlayerMain {

	public static void main(String[] args) {
	//�󱸼��� 2�� ���礩��, ���� ��ȸ �ڵ� �ۼ�
		BasketballPlayer b1 = new BasketballPlayer("�̰���",180,22,500);
		//b1.name="�̰���";
		//b1.age=22;
		//b1.height=180;
		//b1.salary=500;
		
		BasketballPlayer b2 = new BasketballPlayer("������",200,32,800);
		//b2.name="������";
		//b2.age=32;
		//b2.height=200;
		//b2.salary=800;
		
		b1.showInfo();
		b1.dunkShoot();
		b2.showInfo();
		b2.dunkShoot();
	}

}
