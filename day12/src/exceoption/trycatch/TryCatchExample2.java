package exceoption.trycatch;

public class TryCatchExample2 {

	public static void main(String[] args) {
		//� ������ �Ǿ��� �����е��� ���� ���ܰ� �߻��� �� �ִ� ������ �ۼ��Ͻ� ����
		//try catch�� �̿��� ���� �߻��� ó���ǵ��� ���α׷��� �غ�����
		//�� 0���� �����⸦ ������ �������� �̿��� ���ּ���.
		int[] arr = {1,2,3};
		int i =0;
		while(i<4) {
			try{
				System.out.println(arr[i]);
				System.out.println("���� �߻����� �������� �����\n");
			}catch(Exception e) {
				System.out.println("�迭�� ���������� ���.\n");
			}
			finally {
				System.out.println("\n");
			}
			i++;
		}
		System.out.println("���α׷� ����");
	}
}
