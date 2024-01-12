package static_;

public class MainClass {

	public static void main(String[] args) {
		//인스턴스 생성 전부터 이미 조회 가능한 팀점수
		//System.out.println(Asean.presentationScore);
		//스태틱 메서드도 스태틱 변수처럼 객체 생성 이전에 할당됩니다.
		Asean.showPresentaionScore();
		
		//학생 4명 만들어보기
		Asean a1= new Asean("김예빈",20,43);
		Asean a2 = new Asean("서은영",20,46);
		Asean a3 = new Asean("정재현",20,45);
		Asean a4 = new Asean("김우빈",17,42);
		
		a1.showStudentScore();
		a2.showStudentScore();
		a3.showStudentScore();
		a4.showStudentScore();
		
		//어떤 인스턴스를 활용해도 팀 점수 조회가 역시 가능함
		a1.showPresentaionScore();
		//System.out.println(a1.presentationScore);
		System.out.println(a2.presentationScore);
		System.out.println(a3.presentationScore);
		System.out.println(a4.presentationScore);
		
	}
}
