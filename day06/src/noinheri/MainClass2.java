package noinheri;

public class MainClass2 {
	public static void main(String[] args) {
		//���� �ϳ� ����
		Warrior w1 = new Warrior("�ڹ� ������");
		//���� ���� ���� ��ȸ
		w1.showStatus();
		//�� ����
		Rat r1 = new Rat();
		
		//��� ����(3��)
		for(int i =0; i<3;i++) {
			w1.huntRat(r1);
		}
		w1.showStatus();
	}
}
