package exception.runtime;

public class NullPointerExample {

	public static void main(String[] args) {
		String str = null;
		//str = "HELLO";
		
		//.toLowercase() ��� ���ڸ� �ҹ��ڷ� ������ݴϴ�.
		System.out.println(str.toLowerCase());
	}
}
