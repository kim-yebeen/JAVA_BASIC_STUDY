package api.lang.string;

public class StringTrim {

	public static void main(String[] args) {
		//trim�� ����, �������� �ٸ� �ܾ ������ ��������
		//������ ���� �����մϴ�.
		String trimBefore= "                ����  �Ž�  ����   ";
		System.err.println(trimBefore);
		String trimAfter = trimBefore.trim();
		System.out.println(trimAfter);
	}
}
