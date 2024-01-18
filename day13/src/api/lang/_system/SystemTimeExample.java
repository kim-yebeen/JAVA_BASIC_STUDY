package api.lang._system;

public class SystemTimeExample {

	public static void main(String[] args) {
		/*
		 * currentTimeMillis()�� nanoTime() �޼���� UNIX �ð��� ����Ѵ�.
		 * Unix �ð��̶� 1970�⵵ 1�� 1�� --�� --�� 00�ʸ� ��������
		 * �󸶳� �ð��� ���������� ���ڷ� ǥ���ϴ� ü���̴�.
		 * ��������� �ð��� 1000���� 1�ʷ� ��ȯ�� �����ð���
		 * ��������� �ð��� 10����� 1�� ��ȯ�� �����ð��� longŸ������ �����Ѵ�.
		 */
		long start = System.currentTimeMillis();//�޼����� ����Ÿ���� long
		System.out.println("���۽ð� : "+start);
		long sum=0;
		
		for(long i=1; i<10_000_000_000L; i++) {
			sum +=i;
		}
		long end = System.currentTimeMillis();
		System.out.println("���� �ð� : "+end);
		System.out.println("��꿡 �ҿ�� �ð� : "+(end-start));
	}
}
