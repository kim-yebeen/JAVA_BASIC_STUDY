package hetero;

public class MainClass {

	public static void main(String[] args) {
		//�⺻�� �ڷ������� ���� �迭 ����
		//�ٸ� �ڷ����� ���� �� ����
		//int[] iArr = {1,2,3,4,5,"������"};
	
		//A �ڷ����� �� �ּҸ� �迭�� ���� ������ �迭 ����
		A[]  aArr = new A[2];

		A a1 = new A();
		A a2 = new A();
		
		aArr[0] = a1;
		aArr[1] = a2;
		
		//��� Ŭ������ �θ�Ŭ������ Object �迭�� �����ϸ�
		//������ ����(�θ� ��ü�� �䱸�ϴ� �ڸ��� �ڽ�Ÿ���� ���� ������)�� ����
		// ��� �ڷḦ �� ������ �� ����
		Object[] oArr = new Object[2];
		B b1 = new B();
		//aArr[1] = b1; //AŸ���� �䱸�ϴ� �迭���� B type ���� �Ұ�
		oArr[0]=b1; //B
		oArr[1]=a2; //A
		
		oArr[1]=100; //������ object �迭���� �⺻�� �ڷᵵ ���� ����. -> �������� ��û����.
		
	}
}
