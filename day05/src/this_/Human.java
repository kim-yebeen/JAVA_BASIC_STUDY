package this_;

public class Human {
	public String name;
	public int age;
	
	//������ ������ �ϵ�, name, age�� �Է¹޾� �������ּ���.
	//���� �̸��� name, age�� ���ּ���.
	
	public Human(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	//�޼��� �����ε� : �޼��尡 �̸��� �Ȱ����� �䱸�ϴ� �Ķ������ ������ ���ְ� �ٸ� ��
	//�޼��� �����ε����� �̸��� �Է¹޴� ������ ����
	public Human(String name) {
		//this.name=name;
		//age=0;//�ʱⰪ�� �Է¹��� ���� ���� ������ 
		
		this(name,0);//�����ڸ� �����ͼ� ���, ���� �� ����� ����
		
	}
	//�ƹ��͵� �Է����� �ʾ��� ��, name���� "�̸� ����", age���� -1�� ���ԵǴ�
	//void ������ ����
	public Human() {
		this("�̸�����",-1);
		
		//this.name="�̸� ����";
		//this.age=-1;
	}
	public void showInfo() {
		System.out.println("�̸� : "+ this.name + " " + "���� : " + this.age);
	}
}
