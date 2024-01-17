package abstract_.templatemethod;

public abstract class Lottery {

	//���ø� �޼��� ������, ū Ʋ���� ȣ�� ������ �����޼���(���๮�� �ִ� �޼���)
	//�� ������ ����, �����޼��尡 ȣ���ϴ� �߻�޼������
	//��� �Ŀ� Ư¡�� ���ϵ��� ����
	//ȣ�� ������ �״�� ������ �� �ֵ��� �ϵ�, ����ڰ� Ư¡�� �����ϵ��� �ϴ�
	//������ �����Դϴ�.
	
	//�����޼��忡�� ū Ʋ�� ������, ���λ����� �޶��� �� �ִ� ������ ���� �ۼ��մϴ�.
	public final void lotteryCycle() {
		//1.������ ��
		buyLottery();
		//2. ��÷ ���θ� Ȯ��
		checkWinLottery();
		//3. ��÷ �� �����Ϸ� ����.
		getLotteryMoney();
	}
	
	//���λ�����, ��ӹ��� ��ü�� ���������� ���� �ٸ��� ������ �� �ֵ���
	//�߻�޼��常 �����س��� �߰����� �۾��� ���� �ʽ��ϴ�.
	public abstract void buyLottery();
	public abstract void checkWinLottery();
	public abstract void getLotteryMoney();
}
