package exception.runtime;

public class NumberFormatExample {

	public static void main(String[] args) {
		String a ="35";
		String b="21";
		System.out.println(a+b);
		
		//str -> int ��ȯ
		int i = Integer.parseInt(a);//����35�� ���� 35�� ��ȯ
		int j = Integer.parseInt(b);
		System.out.println(i+j);
		
		//parseInt�� ���ڿ� ���ο� ������ ������ ����־��
		//��ȯ�� �����ϸ� �������� �ƴ϶�� numberFormatExeption��
		//�߻��Ѵ�.
		String str="Hello";
		System.out.println(Integer.parseInt(str));
	}
}
