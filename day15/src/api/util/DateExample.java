package api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		//void �Ķ���� ȣ��� ���� �ð�
		Date date = new Date(); //java.util.Date�� ����Ʈ, sql�ƴ�
		System.out.println(date);

		//����ð� �̿��� �ð����� �Է��ϴ� ���
		Date date2 = new Date(133,10,9,18,30,0);
		System.out.println(date2);
		
		//��¥ ��� �ٲٱ�
		//1.SimpleDateFromat ��ü�� �����ϴµ�, ǥ������� �־� �����Ѵ�.
		//����) 2024�� 1�� 22�� 14�� 41�� 50�� �������� ��� ����
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		
		//2. sdf.format(Date �ڷ�������)�� �־ �ֿܼ� ��´�.
		System.out.println(sdf.format(date2));
		
		//������ x���� �Դϴ�. ������ 1���� y��° ���Դϴ�.
		//���� ���ͳݿ� SimpleDateformat ���ǥ�� �˻��ؼ� �ֿܼ� ����غ�����.
		SimpleDateFormat sdf2 = 
				new SimpleDateFormat("������ E�����Դϴ�. ������ 1�� �� D��° ���Դϴ�.");
		System.out.println(sdf2.format(date));
	}
}
