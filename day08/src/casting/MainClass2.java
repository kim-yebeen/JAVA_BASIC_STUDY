package casting;

public class MainClass2 {

	public static void main(String[] args) {
		//Parent Ÿ�Կ��� Child, Child2 ��� ���� ����
		Parent p1 = new Child();
		p1.method2();
		//p1.method3(); 
		//parent Ÿ�����δ� child1�� method2, child2�� method2�� ȣ�� ����
		//method2�� Parnet���� ���ǵǾ� ������ child�� child2���� ���ǵ�
		//�������̵�(������)�� �޼����̱� ������ ȣ�� ������.
	
		//������ ������ �ȵǾ��ٸ�?
		Child child = new Child();
		child.method2();
		
	
	}
}
