package Singleton;

public class MainClass {

	public static void main(String[] args) {
		
		//Singleton 객체는 생성자가 private이므로 인스턴스 생성 불가
		//singleton s1 = new singleton();
	
		//getInstance메소드는 static이어서 new 없이도 바로 사용 가능
		singleton s1= singleton.getInstance();
		System.out.println("s1의 레퍼런스 : "+s1);
		
		singleton s2= singleton.getInstance();
		System.out.println("s2의 레퍼런스 : "+s2);
	}

}
