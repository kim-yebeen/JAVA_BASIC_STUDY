package exceoption.trycatch;

public class TryCatchExample1 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		//int j =5;
		
		try {//���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 �ִ� ����
			System.out.println(i/j); //���� �߻� ���ɼ��� ����
			System.out.println("���� �߻����� ���� ���� �����");
			
		}catch(Exception e) {
			//catch ������ Exception�� ������ ����
			System.out.println("0���� ������ catch������ �Ѿ�Խ��ϴ�.");
		}finally {
			//try, catch  �� �� ������̶� ����Ǹ� ������ �� ����
			System.out.println("��·�� �� ������ �߽��ϴ�.");
		}
		System.out.println("���α׷� ���� !");
	}
}
