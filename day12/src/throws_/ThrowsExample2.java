package throws_;

public class ThrowsExample2 {

	public void aaa(int n) throws Exception{
		System.out.println("aaaȣ��");
		int i = 10/n;
		System.out.println("��� ��� : "+i);
		System.out.println("aaa ���� ����");
	}
	public void bbb() throws Exception{
		System.out.println("bbb ȣ��");
		aaa(0);
		System.out.println("bbb ���� ����");
	}
	public void ccc() throws Exception{
		System.out.println("ccc ȣ��");
		bbb();
		System.out.println("ccc ���� ����");
	}
	public ThrowsExample2() throws Exception{
		System.out.println("������ ȣ��");
		ccc();
		System.out.println("������ ���� ����");
	}
	public static void main(String[] args) {
		try {
			ThrowsExample2 te = new ThrowsExample2();
			} catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("��¥ �ڵ� ȣ�� ��! ");
	}
}
