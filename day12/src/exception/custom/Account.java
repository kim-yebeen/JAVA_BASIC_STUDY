package exception.custom;

public class Account {

	private long balance;
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) throws DepositMinusMoneyException{
		if(money<0) {
			throw new DepositMinusMoneyException("������ �Ա��� �� �����ϴ�.");
		}
		this.balance +=money;
		
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(this.balance<money) {
			throw new BalanceInsufficientException("�ܰ� �����մϴ�.");
		}
		this.balance -=money;
	}
}
