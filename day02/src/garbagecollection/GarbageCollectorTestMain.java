package garbagecollection;

public class GarbageCollectorTestMain {

	public static void main(String[] args) throws Exception{
		//stack �� heap�� ������ �������� �ʴ� ���� test�ϱ� ����
		GarbageCollectorTest test2 = null;
		
		for(int i=0;i<5;i++) {
			GarbageCollectorTest test=
					new GarbageCollectorTest(i);
			
			if( i==3) {
				test2=test; //3����ü�� test2�� ���� ����
			}
			test = null;
			
		}
		
		//������ ���� ���� ���� ��ɾ�(�����δ� �� �ʿ�� ����)
		System.gc();

		Thread.sleep(1000); //1�ʰ� �ڵ� ����
		}

}
