package abstract_.abs;

public class MainClass {

	public static void main(String[] args) {
		//PopupStore Ŭ������ ���� ��ü ���� �Ұ���
		//PopupStore ps = new PopupStore();
	
		//PopupStore s = new Store();
		PopupStore s = new ConvenientStore();
		
		//��ü ������ ���� ���౸���� �ٸ��� ���ǵǾ�����
		//���� ���� �޼���
		s.orderApple();
		s.orderOrange();
		s.orderGrape();
		
		//� ��ü�� �͵� ���������� ����Ǵ� �޼���
		s.refund();
	}
}
