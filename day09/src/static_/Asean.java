package static_;

public class Asean {
	// �ǿ뿵��
	public String name;
	private int attendanceScore; //�������
	private int finalTermScore; //�⸻����

	//����, ����, ����,����
	public static int presentationScore;//29
	
	public Asean(String name, 
			int attendanceScore, 
			int finalTermScire) {
		this.name=name;
		this.attendanceScore=attendanceScore;
		this.finalTermScore=finalTermScire;
	}
	
	//����ƽ ��� ���� �ڵ�� ���α׷� ���۽� ��� �ڵ����� �� �� ȣ���
	static {
		presentationScore=29;
	}
	static void showPresentaionScore() {
		System.out.println(presentationScore);
	}
	
	public void showStudentScore() {
		System.out.println("�л��� : "+this.name);
		System.out.println("�л��� : "+this.attendanceScore);
		System.out.println("�л��� : "+presentationScore);
		System.out.println("�л��� : "+this.finalTermScore);
		System.out.println("�������� : "+ (this.attendanceScore+presentationScore+this.finalTermScore));
		System.out.println("--------------------");
	}
}
