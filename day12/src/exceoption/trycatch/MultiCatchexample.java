package exceoption.trycatch;

public class MultiCatchexample {
	public static void main(String[] args) {
		String data1 ="30";
		String data2 ="11";
		//String data2="0";
		
		try {
			//numberFormatException �߻� ����
			int i=Integer.parseInt(data1);
			int j = Integer.parseInt(data2);
			
			//ArithmeticException �߻�����
			int result = i/j;
			System.out.println("i/j="+result);
		
			//NullPointException �߻� ����
			String str = null;
			str.charAt(0);//0��° ���� ���...�ε� null
		}catch(NumberFormatException | NullPointerException e) {
			System.err.println("������ Ȥ�� ���ڸ� �־��ּ���");
			System.err.println("Ȥ�� ���ڸ��� ����� ������ּ���");
		}catch (ArithmeticException e) {
			System.err.println("0���� ���� �� �����ϴ�.");
		}catch(Exception e) { //���� ���� ó��(��κ��� ������ �� Ŀ������)
			System.err.println("�� �� ���� ������ �߻��߽��ϴ�.");
			System.err.println("�������Դϴ�.");
		}
	}
}
