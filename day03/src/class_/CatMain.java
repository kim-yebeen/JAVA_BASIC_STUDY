package class_;

public class CatMain {
	
	public static void main(String[] args) {
		//����� 2���� ����
		Cat c1 = new Cat();
		c1.name="�����";
		c1.age = 5;
		c1.kind = "����ƽ�����";
		c1.color="ġ��";
		
		Cat c2 = new Cat();
		c2.name="���";
		c2.age = 5;
		c2.kind = "pond";
		c2.color="cheese";
		
		c1.showCatInfo();
		c2.showCatInfo();		
	}

}
