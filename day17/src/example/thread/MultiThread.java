package example.thread;

//���� �����忡�� ������ ������ �����ϱ� ����
//1.Runnable �������̽��� �����Ѵ�.
public class MultiThread implements Runnable{

	//2.Runnable �������̽��� run() �޼��带 �������̵��� ������ ������ ���´�.
	@Override
	public void run() {
		//���±��� �ڵ�� ���������� ���½ð� ���� ����Ǿ���
		//Thread.sleep (�и���);�� �ش� ������ ������ �Է��� �ʸ�ŭ �ߴ��Ѵ�.
		//������ ������ try-catch ���� �ݵ�� �־�� �Ѵ�.
		try {
			for(int i=0;i<500;i++) {
				System.out.println("���������� : ����"+i);
				Thread.sleep(200);//0.2��
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
