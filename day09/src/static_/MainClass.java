package static_;

public class MainClass {

	public static void main(String[] args) {
		//�ν��Ͻ� ���� ������ �̹� ��ȸ ������ ������
		//System.out.println(Asean.presentationScore);
		//����ƽ �޼��嵵 ����ƽ ����ó�� ��ü ���� ������ �Ҵ�˴ϴ�.
		Asean.showPresentaionScore();
		
		//�л� 4�� ������
		Asean a1= new Asean("�迹��",20,43);
		Asean a2 = new Asean("������",20,46);
		Asean a3 = new Asean("������",20,45);
		Asean a4 = new Asean("����",17,42);
		
		a1.showStudentScore();
		a2.showStudentScore();
		a3.showStudentScore();
		a4.showStudentScore();
		
		//� �ν��Ͻ��� Ȱ���ص� �� ���� ��ȸ�� ���� ������
		a1.showPresentaionScore();
		//System.out.println(a1.presentationScore);
		System.out.println(a2.presentationScore);
		System.out.println(a3.presentationScore);
		System.out.println(a4.presentationScore);
		
	}
}
