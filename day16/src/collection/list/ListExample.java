package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ListExample {

	public static void main(String[] args) {
		//ArrayList�� LinkedList�� ������� ���� List �������̽��� �����ϴ�.
		//���� ��ȯ�� �����մϴ�. �������̽��� ���� ����ü���� ������ ��� �����ϴ�.
		//���׸� : Ÿ�� ����ȭ�� ���� ��ü ���ο� ����Ǵ� Ÿ���� ��ġ��Ű�� ���
		//String�� ������ �� �ִ� �÷���
		
		//�������� ����Ǵ� Ư�� �������̽� Ÿ�Կ� ����ü�� ���������� �����ϴ� ������ ���������̶�� �մϴ�.
		//List<String> list = new ArrayList<>(); //1.8�������ʹ� �����ڿ� ���׸� ǥ�� x
		List<String> list = new LinkedList<>();
		
		String str1="Java";
		String str2="SpringBoot";
		System.out.println(list); //�÷��ǵ��� toString()�� �ڵ����� �������̵� �Ǿ�
								//�ּҰ��� �ƴ� ���� ���� ��Ұ� �ٷ� �ֿܼ� ����
		
		//list�� ��ü�� �����ϴ� �޼��� add() : �����͸� ������ ������ �߰�
		list.add(str1);
		list.add(str2);
		list.add("infra");
		list.add("docker");
		list.add("linux");
		list.add("linux");//�ߺ����� ���
		System.out.println(list);
	
		//list�� ����� �� ��ü �� ��� .size()
		int size=list.size();
		System.out.println("list�� ����� �� ��ü�� �� : "+size);
	
		//list�� ��ü ���� add(index, ��ü) : �����͸� �ش� �ε��� ��ȣ�� �ְ�
		//�ش� �ε��� ���� �ڷ�� ���� �� ĭ�� �ڷ� �о����
		list.add(2,"Network");
		System.out.println(list);
		
		//list ������ ���� set(index, ��ü)
		//list[3] = "ubuntu"; //�Ϲ� �ε������� �����ϱ� ��� �Ұ�
		list.set(5, "ubuntu");
		System.out.println(list);
		
		//list ���ΰ�ü �������� get(index)
		String s = list.get(2);
		System.out.println(s);
		
		//list ���ο� ����� ��ü�� ��ȣ�� �� ������ Ȯ���ϱ�
		int idx = list.indexOf("docker"); //���� �ڷ� ��ȸ�� -1
		System.out.println(idx);
		
		//list���� ��ü ������ ���� remove(index), remove(��ü)
		list.remove(5);
		System.out.println(list);
		list.remove(str1);
		System.out.println(list);
		
		//list ���ο� ����� ��ü�� ���� Ȯ�� contains() -> ������ true, ������ false
		System.out.println(list.contains(str2));
		
		//list�� �ݺ��� ó��
		//�ε����� ��ȸ
		for(int i =0;i<list.size();i++)
		{
			System.out.println("���ο�� : "+list.get(i));
		}
		System.out.println("------------");
		//���� for���� ��� ���� (List<String>���� ���������Ƿ� String���� �ޱ�
		for(String str : list) {
			System.out.println("���� ��� : "+str);
		}
		
		//list������ ��ü �ڷ� ���� clear()
		list.clear();
		System.out.println(list); //list������ �� ����Ʈ�� ��������.
		
		//list ���� �����Ͱ� ���� ����ִ��� Ȯ���ϴ� �޼��� isEmpty()
		System.out.println(list.isEmpty());
		
	}
}
