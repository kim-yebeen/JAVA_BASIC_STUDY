package exception.runtime;

//�ϳ��� Ŭ���� ���Ͽ� 2�� �̻��� Ŭ���� ���� ����(���� ��������� ����)
//��� ����:�θ� animal �� ����� �ڽ� dog, cat

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class ClassCastExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal da = d;
		d = (Dog)da;
		
		System.out.println("Ÿ�� ��ȯ ���� : Animal ->Dog");
		
		Animal c = new Cat();
		Dog d2 = (Dog)c; //Cat�� Dog Ÿ������ ��ȯ �Ұ�
		System.out.println("Ÿ�� ��ȯ ���� : Dog -> Cat");
	}
}
