package final_field;

public class MainClass {
	
	public static void main(String[] args) {
		Person kim=new Person("���ڹ�");
		//kim.nationality ="�Ϻ�" //final ������ ���� �Ұ�
		//kim.name="ä�ڹ�; //final ������ ���� �Ұ�
		kim.age=25;
		System.out.println("���� : "+kim.nationality);//public �̹Ƿ�
		System.out.println("�̸� : "+kim.name);//public �̹Ƿ�
		System.out.println("���� : "+kim.age);//public �̹Ƿ�
		
	}
}
