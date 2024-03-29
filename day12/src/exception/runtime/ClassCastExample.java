package exception.runtime;

//하나의 클래스 파일에 2개 이상의 클래스 선언 가능(자주 사용하지는 않음)
//상속 관계:부모 animal 을 상속한 자식 dog, cat

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class ClassCastExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal da = d;
		d = (Dog)da;
		
		System.out.println("타입 변환 성공 : Animal ->Dog");
		
		Animal c = new Cat();
		Dog d2 = (Dog)c; //Cat은 Dog 타입으로 변환 불가
		System.out.println("타입 변환 성공 : Dog -> Cat");
	}
}
