package instanceof_;

public class Human {
	private String name;
	private int age;
	
	//�����ڸ� ������ּ���.
	//name, age�� �Ķ���ͷ� ���޹޾� �ʱ�ȭ���ּ���.
	
	public Human(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//���� void �Ķ���ͷ� ������ ȣ�� ��
	//"nomae", 0�� �̸��� ���̷� �ʱ�ȭ�ϴ� �����ڸ� �Ʒ��� �������ּ���.
	public Human() {
		this("noname",0); 
		//this.name="noname";
		//this.age=0;
	}
	
	public void showInfo(){
		System.out.println("�̸� : "+this.name);
		System.out.println("���� : "+this.age);
		System.out.println("----------------");

	}
}
