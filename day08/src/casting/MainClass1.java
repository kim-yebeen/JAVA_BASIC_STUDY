package casting;

public class MainClass1 {

	public static void main(String[] args) {

		//promotion�� ����Ǹ� �ڽ�Ŭ�������� ���ǵǴ� ��� ��ȸ �Ұ���
		Parent p = new Child();
		p.method1();//parent������ ���ǵ� �޼ҵ�
		p.method2();//�������̵��� �޼���� Ÿ�� ������� �ν��Ͻ� �� �ڽ��� ȣ��
		//p.method3();//pŸ�� �����δ� �ڽ��ʿ��� ���ǵ� ��Ҵ� ȣ�� �Ұ���
		System.out.println("-------------------------");
		
		Child c =(Child )p; //�θ�Ÿ�� ������ �ڽ� Ÿ������ ���� ����ȯ(cast)
		c.method2(); //���� �����ϰ� �ڽ��� method2 ȣ��
		c.method3(); //�� ��ȯ �Ŀ��� �ڽ��ʿ��� �ִ� ��ҵ� ȣ�� ����
		
		Child cc = new Child(); //���ʿ� �ڽ�Ÿ������ �ν��Ͻ� ���Խÿ���
		cc.method3(); //�ڽ��ʿ��� �ִ� ��� ȣ�� ����
	}

}

