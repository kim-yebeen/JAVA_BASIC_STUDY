package example.thread;

public class MainThread {

	public static void main(String[] args) {
		//���� ������ ������ ���ؼ��� ���� Thread ��ü�� �����ؾ� �Ѵ�.
		
		//1. Runnable ����ü�� �������ּ���.
		Runnable trd = new MultiThread();
		
		//2. Thread Ŭ������ �ν��Ͻ��� �������ּ���.
		//������ ȣ��� ���� Runnable ����ü�� �Ķ���ͷ� �ѱ�ϴ�.
		Thread sTrd=new Thread(trd);
		
		System.out.println("���� ������ �غ� �Ϸ� !");
		
		//3. ���� ������� .start()�� ȣ���� �� �ֽ��ϴ�.
		sTrd.start();
		System.out.println("���� ������ ���α׷��� ��� ���ư��� ���θ޼���");
		
	}
}
