package Singleton;

public class singleton {

	/*
	 * �̱��� ���� - ��ü�� 1���� ����� �����ϱ� ���� ������ ����
	 * 1. �ܺο��� �����ڸ� ����� �� ������ �����ڿ� private ���� 
	 */
	private singleton() {}
		/*
		 * 2. �ڽ��� Ŭ���� ���ο��� �������� ��ü 1���� �����մϴ�.
		 * �� ��, ��������� ���� �Ҵ�� ��ü ���� �� �� �ֵ��� static �Դϴ�.
		 */
		private static singleton instance;
		
		static {
			instance=new singleton();
		}
	
		/*
		 * 3.�ܺο��� �� Ŭ������ ��ü�� �ʿ�� �ϴ� ���
		 * 2������ static���� ������ ��ü�� �ּҸ� return �մϴ�.
		 */
		public static singleton getInstance() {
			if(instance==null) {
				instance = new singleton();
			}
			return instance;
		}
}
