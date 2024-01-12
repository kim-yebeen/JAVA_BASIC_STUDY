package super_;

public class Airplane {
	public String planeCode;
	protected int speed;
	public int gas;
	
	//�ӵ� 0, ���� 100���� ����, ��� �Է¹޴� ������ ����
	public Airplane(String planeCode) {
		this.speed=0;
		this.gas=100;
	}
	// �ִ�ӵ��� 900���� �����ϴ� �޼��� fly�� �����ϰڽ��ϴ�.
		// ȣ��� ����� 3�� �����ǰ�, �ӵ��� 100�� �����մϴ�.
		public void fly() {
			if(this.gas - 3 < 0) {
				System.out.println("���� �������� ���� �Ұ���.");
				return; // �޼��� ��������
			}
			
			if(this.speed + 100 >= 900) {
				this.speed = 900;
				this.gas -= 3;
				return;
			}
			this.speed += 100;
			this.gas -= 3;
		}
		// ����Ǻ��� �޼���
		public void showStatus() {
			System.out.println("��� : " + this.planeCode);
			System.out.println("�ӷ� : " + this.speed);
			System.out.println("���� : " + this.gas);
		}
		
}
