package class_;

public class Cat {

	//�̸�, ����, ǰ��, �� ����
	public String name;
	public int age;
	public String kind;
	public String color;
	
	//Ŭ���� ���ǿ� Ŭ�N������ ���� �޼���� static�� ������ �ʴ´�.
	//���� ������ �޼��尡 ���� �Ҽ��̹Ƿ�, ���۷��� �ּҸ� ������ �ʾƵ� �˴ϴ�.
	public void showCatInfo() {
		System.out.println("������� �̸� : "+name);
		System.out.println("������� �� : "+age);
		System.out.println("������� ǰ�� : "+kind);
		System.out.println("������� ���� : "+color);
		
	}
}
