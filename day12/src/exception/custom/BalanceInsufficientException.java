package exception.custom;


//�ܰ� ����� ����
//����� ���� ���� Ŭ������ ������� exceptionŬ������ runtimeexception Ŭ������ ����Ѵ�.
public class BalanceInsufficientException extends RuntimeException {

	//�Ϲ������� ����� ���� ���� Ŭ������ ���鶧��
	//�⺻ �����ڿ� ���ܿ��� �޼����� �޴� �����ڸ�
	// �� �� �����ε��ؼ� ���� ���ش�.
	public BalanceInsufficientException() {};
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
