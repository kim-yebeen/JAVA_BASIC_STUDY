package api.lang.string;

public class StringSubstring {
public static void main(String[] args) {
	//�ֹι�ȣ ���
	String ssn="950613-1329526";
	System.out.println(ssn);
	
	//substring() �޼��忡 �Ű������� �ε����� 1�� ������
	//�ش� �ε������� ������ ���������� ���ڸ� �����մϴ�.
	String last=ssn.substring(7);//7������~
	System.out.println(last);

	//subString() �޼��忡 �Ű������� �ε����� 2�� ������
	//ù ��° �Ű��� �̻�, �� ��° �Ű��� �̸� ���� ���ڸ� �����մϴ�.
	String first = ssn.substring(0,6); // 0 1 2 3 4 5���� ��ȸ, 6�� ���� X
	System.out.println(first);
}
}
