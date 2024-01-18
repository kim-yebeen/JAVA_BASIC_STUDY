package exception.custom;

public class MainClass {

	public static void main(String[] args) {
		Account acc = new Account();
		
		try {
			acc.deposit(100000);
			System.out.println("�Ա� �� �ܾ� : "+acc.getBalance()+"��");
			acc.withdraw(1000000);
		}catch(BalanceInsufficientException e) {
			//���� Ŭ������ �����ϴ� getMessgae() �޼���� ������ ���� �޼�����
			//String type���� �����մϴ�. �ڹ� ǥ�� api���� �����ϴ� �پ��� ����Ŭ��������
			//������ ���� ���� �޼����� �⺻������ ��ü �ȿ� ����Ǿ� �ֽ��ϴ�.
			e.printStackTrace();
			//�����ڿ��� �������� �޼����� �״�� �����
			System.out.println(e.getMessage());
		}catch(DepositMinusMoneyException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		System.out.println("��� �� �ܾ� : "+acc.getBalance()+"��");
	}
}
