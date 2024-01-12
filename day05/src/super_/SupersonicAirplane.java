package super_;

public class SupersonicAirplane extends Airplane{

	// ���Ӱ� ���ǵ� ������� ����
	
		public SupersonicAirplane(String planeCode) {
			// �����ڴ� ����� ���� ����. ���� �ڽ��� �����ڿ���
			// �θ�����ڸ� ���� �ʱ�ȭ���ְ�, ������ �ڵ带 �����ؾ���.
			super(planeCode);
		}
		
		// ������ ����⵵ fly()�� ���������, �Ϲ� ����⺸�� Ȯ��� ������ ����ϹǷ�
		// �������̵��� ���� �߰����� ���Ǹ� �ؾ� �մϴ�.
		// �ٸ� 900km/h ���Ͽ����� �Ϲ� ������, �� ���Ŀ��� ������ ������ �ϹǷ�
		// �ü� 900km ���� ���������� �������̵� �Ǳ� ���� fly()��
		// ���Ŀ��� �����ǵ� fly()�� ȣ���ϰ� �ؾ� �մϴ�.
		@Override
		public void fly() {
			if(this.speed < 900) {// �Ϲ� ���� ����������
				super.fly(); // �������̵� �� fly() ȣ��
			}else if(this.speed + 300 <= 2200 && this.gas >= 5) {
				this.speed += 300;
				this.gas -= 5;
			}else if(this.speed + 300 >= 2200 && this.gas >= 5) {
				this.speed = 2200;
				this.gas -= 5;
			} else {
				System.out.println("���ᰡ ������ ������ �Ұ����մϴ�.");
			}
		}
		
}
