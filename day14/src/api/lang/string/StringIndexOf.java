package api.lang.string;

public class StringIndexOf {

	public static void main(String[] args) {
		//Ư�� ���ڿ��� ���� �ε��� ���� ��ȯ�մϴ�.
		String to ="tomatoes";
		
		//���� �Ķ���ͷ� ��ȸ�� �� ��� 0������ ���� ����� �ܾ� �ϳ��� ��ȸ�˴ϴ�.
		System.out.println(to.indexOf("to"));
		
		//�� ��° �Ķ���ͷ� ��ȸ ���� �Ķ���͸� ������ �� �ֽ��ϴ�.
		System.out.println(to.indexOf("to",1)); //0�����Ͱ� �ƴ� 1������ ��ȸ

		//���´ܾ� ��ȸ�� -1�̤� ���ɴϴ�.
		System.out.println(to.indexOf("na"));
	}
}
