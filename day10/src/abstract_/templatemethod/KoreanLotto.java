package abstract_.templatemethod;

public class KoreanLotto extends Lottery{

	@Override
	public void buyLottery() {
		System.out.println("�� ���ӿ� õ��¥�� �ζǸ� ��ϴ�.");
	}
	
	@Override
	public void checkWinLottery() {
		System.out.println("405c6�� Ȯ���� �հ� 1� ��÷�Ǿ����ϴ�.");
		
	}
	
	@Override
	public void getLotteryMoney() {
		System.out.println("1�� ������� �뷫 ���ʾ��� �޾ҽ��ϴ�.");
	}
}
