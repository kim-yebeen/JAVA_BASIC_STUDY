package Singleton;

public class MainClass {

	public static void main(String[] args) {
		
		//Singleton ��ü�� �����ڰ� private�̹Ƿ� �ν��Ͻ� ���� �Ұ�
		//singleton s1 = new singleton();
	
		//getInstance�޼ҵ�� static�̾ new ���̵� �ٷ� ��� ����
		singleton s1= singleton.getInstance();
		System.out.println("s1�� ���۷��� : "+s1);
		
		singleton s2= singleton.getInstance();
		System.out.println("s2�� ���۷��� : "+s2);
	}

}
