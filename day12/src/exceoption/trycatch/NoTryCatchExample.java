package exceoption.trycatch;

public class NoTryCatchExample {

	public static void main(String[] args) {
		int prevValue = 5;
		int nextValue = 0;
		
		//nextVlaue�� 0�� �ȵ����� ���� �߻� ����
		if(nextValue !=0) {
			System.out.println(prevValue/nextValue);
		}else {
			System.out.println("0�� ������ ������ ���� �� �����ϴ�.");
		}
	}
}
