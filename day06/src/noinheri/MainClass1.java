package noinheri;

public class MainClass1 {
	public static void main(String[] args) {
//���� �ϳ� ����
	Warrior w1 = new Warrior("����������");
	//���� ���� ���� ��ȸ
	w1.showStatus();
	//�䳢����
	Rabbit r1= new Rabbit();
	//�䳢�� ����
	w1.huntRabbit(r1);
	//���� �䳢 �� �� �� �����غ���
	w1.huntRabbit(r1);
	//��� �� ���� ��ȸ
	w1.showStatus();
	//huntRat �޼��带 �������ּ���.
	//�⺻�� ������ �Ȱ���, Rabbit��� Rat �ڷ����� �䱸�մϴ�.
	//Rat�� ������ �ް� ���� ������ 1ȸ �ݰ��մϴ�.
	//����ġ�� 80�Դϴ�.
	//public void huntRat() {
		
	}		
	
}
