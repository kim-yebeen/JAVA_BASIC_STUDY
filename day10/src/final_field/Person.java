package final_field;

public class Person {

	/*
	 * final ������ �� �� �� �ʱ�ȭ �� �� �ְ�
	 * ���Ŀ��� ������ �Ұ����ϱ� ������
	 * ���� �ÿ� �ƿ� ���� �ʱ�ȭ�� ���ְų�
	 * Ȥ�� �����ڿ��� �ʱ�ȭ�� �� ��� �մϴ�.
	 */
	public final String nationality ="���ѹα�"; //����� �ʱ�ȭ
	public final String name; //�̷��� ����� �ʱ�ȭ�� �� �ϸ� ������ �ʱ�ȭ
	public int age; //final�� �� ���� ��� ������ �ʱ�ȭ �ǹ� ����
	
	public Person(String name) {
		this.name=name;
	}
}
