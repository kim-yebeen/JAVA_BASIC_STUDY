package throws_;

public class ThrowsExample {

	public static String[] greetings = {"�ȳ�","�οӵ�","���"	};
	/*
	 * ������ ������ �޼��� ����ΰ� �ƴ� ȣ��ο� ���� ���
	 * �޸� ������ �ٸ��Ƿ� ����ó���� �޼��� ȣ���������� ���Ѱ���� �մϴ�.
	 * �̸� throws��� �ϰ�, �޼��� Ȥ�� ������ ȣ�� �� ����ó���� �����Ҷ� ����մϴ�.
	 */
	
	//������ ���� ���ܰ� ������, ȣ���(���⼭�� main)���� ó���� ���ѱ�ڴ�.
	public static void greet(int idx) throws Exception {
		//ArrayIndexOutOfBoundsException �߻� ����
		System.out.println(greetings[idx]);
		
	}
	public static void main(String[] args) {
		//throws�� �پ��ִ� �޼��峪 ������ ȣ��ÿ��� 
		//�ش� �޼��带 try ��� ���ο��� ȣ���ؾ� ����ó���� �������ݴϴ�.
		try {
			greet(4);
		}catch(Exception e) {
			//printStackTrace()�� ���ܹ߻� ��θ� �����ϴ� �޼����� ����մϴ�.
			// �ַ� ���߰������� ������ �������������� �� �����մϴ�.
			e.printStackTrace();
		}
		System.out.println("���α׷� ���� ����!");
		
	}
}
