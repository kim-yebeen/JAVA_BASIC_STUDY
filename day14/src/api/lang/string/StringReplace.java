package api.lang.string;

public class StringReplace {

	public static void main(String[] args) {
		//�ڹٴ� 15�������� ��Ƽ���� ���ڿ��� �����մϴ�.
		//���� �ڹ� ���ڿ��� ���ݴ� ""�� �� �ٿ� �ۼ��߾�߸� �߾����ϴ�.
		//String a = "�����ٶ�"; ok
		//String a = "�����ٶ�
		//                 ���ٻ�"; not ok
		//���ݴ� ����ǥ�� �ٸ� �ٿ� ��ġ�� ���� "�� ��(""")�� �̿��մϴ�.
		//"""�� ����� �ٿ��� ���ڿ��� �ۼ��� �� ����, ���� �ٺ��� �ۼ� �����մϴ�.
		String notice = """
						��������
						1. ���� ö���� ���ּ���
						2. ȸ��� �ۼ����ּ���
						3. ���ɻ縦 ���߰��ο� �������ּ���.""";
		System.out.println(notice);
		//replace()�� String�� �����ϰ�, ù �ܾ �� ��° �ܾ�� �ٲ��ݴϴ�.
		String newNotice = notice.replace("���ּ���", "���ֽʽÿ�");
				System.out.println(newNotice);
	}
}
