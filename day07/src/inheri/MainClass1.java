package inheri;

public class MainClass1 {

	public static void main(String[] args) {
		//���� ����
		Warrior w1 = new Warrior("�䳢õ��");
		//���� ��ȸ
		w1.showStatus();
		
		//�䳢 ����
		Rabbit r1 = new Rabbit();
		
		//����� ���� 2ȸ
		w1.hunt(r1);
		w1.hunt(r1);
		
		//�� ����
		Rat rat1 = new Rat();
		
		//��� ���� 3��
		w1.hunt(rat1);
		w1.hunt(rat1);
		w1.hunt(rat1);
		
		//���� ����
		Cockroach c1 = new Cockroach();
		
		//���� 2��
		w1.hunt(c1);
		w1.hunt(c1);
		
		//���� ��ȸ
		w1.showStatus();
	}
}
