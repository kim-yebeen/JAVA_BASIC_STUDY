package Struct;

public class HumanMain {
	public static void main(String[] args) {

		//new Ű����� ���� �ڷḦ �����Ѵ�.
		// �ڷ��� ���� = new �ڷ���();
		// �� ��ɾ�� ����ü�� �ν��Ͻ��� ������ �� �ִ�.
		// newŰ������ ���� �ڷ�� �ش� ���� �ּ�
		
		//��� 1 ����
		Human h1 = new Human();
		h1.name="�迹��";
		h1.age=20;
		h1.height=175;
		
		getHumanInfo(h1);
		
		System.out.println("��� 1�� �̸� : " + h1.name);
		System.out.println("��� 1�� �ּ� : "+h1);
		
		//��� 2 ����
		Human h2 = new Human();
		h2.name="���߿�";
		h2.age=10;
		h2.height=180;
		
		getHumanInfo(h2);
		
		System.out.println("��� 1�� �̸� : " + h2.name);
		System.out.println("��� 1�� �ּ� : "+h2);
	
	}
	//Human ����ü�� �޾Ƽ�, �ش� ����ü�� ��ü �ʵ� ������ �ֿܼ� ����ϴ�.
	public static void getHumanInfo(Human human) {
		System.out.println("����� �̸� :" + human.name);
		System.out.println("����� ���� :" + human.age);
		System.out.println("����� Ű :" + human.height);
	}
}

