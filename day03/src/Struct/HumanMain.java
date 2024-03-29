package Struct;

public class HumanMain {
	public static void main(String[] args) {

		//new 키워드는 힙에 자료를 저장한다.
		// 자료형 변수 = new 자료형();
		// 위 명령어로 구조체의 인스턴스를 생성할 수 있다.
		// new키워드의 리턴 자료는 해당 힙의 주소
		
		//사람 1 생성
		Human h1 = new Human();
		h1.name="김예빈";
		h1.age=20;
		h1.height=175;
		
		getHumanInfo(h1);
		
		System.out.println("사람 1의 이름 : " + h1.name);
		System.out.println("사람 1의 주소 : "+h1);
		
		//사람 2 생성
		Human h2 = new Human();
		h2.name="개발왕";
		h2.age=10;
		h2.height=180;
		
		getHumanInfo(h2);
		
		System.out.println("사람 1의 이름 : " + h2.name);
		System.out.println("사람 1의 주소 : "+h2);
	
	}
	//Human 구조체를 받아서, 해당 구조체의 전체 필드 정보를 콘솔에 찍습니다.
	public static void getHumanInfo(Human human) {
		System.out.println("사람의 이름 :" + human.name);
		System.out.println("사람의 나이 :" + human.age);
		System.out.println("사람의 키 :" + human.height);
	}
}

