package instanceof_;

public class MainClass {

	public static void main(String[] args) {
		//Human, Student, Cat �ν��Ͻ��� �����غ��ڳ��̴�.
		Human h1 = new Human("���ڹ�", 20);
		h1.showInfo();
		
		Student s1 = new Student("�±���", 19);
		s1.showInfo();
		
		Cat c1 = new Cat("���",6);
		c1.meow();
		
		System.out.println(h1 instanceof Human); //h1�� Human ����ΰ�
		System.out.println(s1 instanceof Human);//s1�� Human ����ΰ�
		
		//������ �ƿ� ���� ��ü�� �񱳴� ���� �߻�
		//System.out.println(h1 instance of Cat);
		//System.out.println(s1 instance of Cat);
	}

}
