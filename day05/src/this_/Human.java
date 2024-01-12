package this_;

public class Human {
	public String name;
	public int age;
	
	//생성자 선언을 하되, name, age를 입력받아 대입해주세요.
	//변수 이름은 name, age로 해주세요.
	
	public Human(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	//메서드 오버로딩 : 메서드가 이름이 똑같은데 요구하는 파라미터의 정보나 범주가 다른 것
	//메서드 오버로딩으로 이름만 입력받는 생성자 정의
	public Human(String name) {
		//this.name=name;
		//age=0;//초기값을 입력받은 것이 없기 때문에 
		
		this(name,0);//생성자를 가져와서 사용, 위의 두 문장과 동일
		
	}
	//아무것도 입력하지 않았을 때, name에는 "이름 없음", age에는 -1이 대입되는
	//void 생성자 정의
	public Human() {
		this("이름없음",-1);
		
		//this.name="이름 없음";
		//this.age=-1;
	}
	public void showInfo() {
		System.out.println("이름 : "+ this.name + " " + "나이 : " + this.age);
	}
}
