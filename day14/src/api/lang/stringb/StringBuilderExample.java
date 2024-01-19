package api.lang.stringb;

public class StringBuilderExample {

	public static void main(String[] args) {
		//�� �ڵ忡�� StringBuilder�� ���� StringBuffer�� ��ü�ص� �� �����Ѵ�.
		//���� ���̴� ����������� ����Ǵ��� �ƴ��� ���λ��̴�.
		//���� ������ ������ ����ް� �ʹٸ� StringBuffer�� ����ϸ� �ȴ�.
		StringBuffer sb = new StringBuffer("JAVA");
		
		//���ڿ� ���� �߰��ϴ� �޼��� Append()
		sb.append(" Program Study"); // sb+="program study"�� ����
		System.out.println(sb);
		
		//���ڿ��� Ư�� �ε��� ��ġ�� �����ϴ� �޼��� insert()
		sb.insert(12, "ming");
		System.out.println(sb);
		
		//Ư�� �ε��� ���� ���ڿ��� ��ü�ϴ� �޼��� replace()
		sb.replace(5, 16,"book"); //5-15�� �ε��� 11���ڸ� "book" 4���ڷ� ġȯ
		System.out.println(sb);
		
		//���ڿ��� �����ϴ� �޼��� delete(begin, end)
		sb.delete(4, 9);
		System.out.println(sb);
		
		System.out.println(sb.length());

	}
}
