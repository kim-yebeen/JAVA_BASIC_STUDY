package api.lang.wrapper;

import java.util.Arrays;

public class Wrapping {
	public static void main(String[] args) {
		int a = 100;
		double b = 2.41;
		char c = 'H';
		boolean d = false;
		
		//Wrapping : �⺻�� Ÿ���� ������ Ÿ������ �����
		//���� new Integer(15); �� ���� �������� ����ؾ� ������
		//������ �ö���鼭 �׳� �´� �ڷḦ �������ִ°͸����ε� ��ü�� ���� �Ҵ��.
					//��Ҽ� : deprecated(��� ����)
		Integer val1 = a;//new Integar(a);
		Double val2 = b; 
		Character val3 =c;
		Boolean val4 = d;
		Byte val5 = (byte)75;
		
		Object[] arr = {val1, val2, val3, val4, val5};
		System.out.println(Arrays.toString(arr));
		
		//Unwrapping : ���� Ŭ������ �ٽ� �⺻���ڷ�� ��������
		// .�ڷ���vlaue() �޼��带 ���
		int i = val1.intValue();
		double j = val2.doubleValue();
		char k = val3.charValue();
		boolean x = val4.booleanValue();
		byte y = val5.byteValue();
		
	}

}
