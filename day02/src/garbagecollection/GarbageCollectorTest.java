package garbagecollection;

public class GarbageCollectorTest {

	public int objectNum;//��ü ��ȣ - public �̱⿡ setter, getter���� ��ȸ ����

	// ������( ��ü�� ������ ������ �� ȣ��Ǵ� �޼���)
	public GarbageCollectorTest(int number) {
		objectNum=number;
		System.out.println(objectNum + "�� ��ü ����");
	}
	
	//�Ҹ���(�ڹٿ����� �Ϲ������� ������� ����, ��ü�� ������ �����Ǳ� ���� ����)
	protected void finalize() throws Throwable{
		System.out.println(objectNum+"�� ��ü�� ������ �����˴ϴ�.");
	}
}
