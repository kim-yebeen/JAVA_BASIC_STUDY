package api.lang.string;

public class StringMemory {

	public static void main(String[] args) {
		//String�� ���� ������ �ٸ� ���ڴ� �׻� ���Ӱ� �Ҵ��ϱ� ������ ������ �ȴ�.
		//String a = "0";
		
		
		//StringBuilder, StringBuffer�� ���ڵ� �޸� ����� ���� �����ϰ� ������
		// ���� ���� ������ �ٲ� ���ο� �Ҵ��� �� �Ͼ�� �����Ƿ� ���ɻ� ������ ����
		//StringBuilder��
		//StringBuilder sb=new StringBuilder("0");
		StringBuffer sb = new StringBuffer("0");
		
		long start=System.currentTimeMillis();
	
		for(int i=0;i<1_000_000;i++) {
		//	a+= "0"; //a���ڿ� 0�� 100���� ����
			//�� �Ҵ絵 100���� �� -> �ӵ��� ������.. �ҿ�ð� 12898
			sb.append("0");//sb�� 0�� �鸸�� ����
			//�� �Ҵ��� ���� ���Ӱ� �Ͼ�� ���� ->�ӵ��� ��û ������.. �ҿ�ð� 13
		}
		long end= System.currentTimeMillis();
		System.out.println("�ҿ�ð�(�и���) : "+(end-start));
	}
}
