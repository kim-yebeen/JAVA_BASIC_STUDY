package casting;

public class MainClass2 {

	public static void main(String[] args) {
		//Parent 타입에는 Child, Child2 모두 대입 가능
		Parent p1 = new Child();
		p1.method2();
		//p1.method3(); 
		//parent 타입으로는 child1의 method2, child2의 method2도 호출 가능
		//method2는 Parnet에도 정의되어 있지만 child와 child2에도 정의된
		//오버라이딩(재정의)된 메서드이기 때문에 호출 가능함.
	
		//다형성 적용이 안되었다면?
		Child child = new Child();
		child.method2();
		
	
	}
}
