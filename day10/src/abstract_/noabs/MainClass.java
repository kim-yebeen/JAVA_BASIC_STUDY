package abstract_.noabs;

public class MainClass {

	public static void main(String[] args) {
		//2���� ������ üũ
	
		//1. ���� ������ �����ϴµ� �˾������ ���� ����
		PopupStore ps = new PopupStore();
		
		//2. �˾������ Ŭ���� ���ο��� �������̵��� �ʼ��� �޼��尡 �����ɼ��� ����
		PopupStore s = new Store();
		s.orderApple(); //����ֽ� ���� å����
		s.orderOrange(); //�������� �ֽ� ���� å����
		s.orderGrape(); //�����ֽ� ���� ������
	}
}
