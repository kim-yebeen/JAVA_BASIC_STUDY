package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//���׸����� ���� �ڷ����� �����մϴ�.
		Set<String> set = new HashSet<>();
		
		//add() : set�� ��ü�� �߰�
		set.add("�߰���");
		set.add("�ʹ�");
		set.add("������");
		set.add("������");
		set.add("�߰���"); //�ߺ��Է� : ������ ����
		
		//size() : set�� ����� ��ü�� ���� �˾ƺ��� �޼���
		System.out.println("set�� ����� ��ü�� �� : "+set.size()); //4��
		System.out.println(set);
		
		//Set�� ��ü�����͸� ����Ϸ��� �ݺ���(Iterator)�� ����
		//��� ��ü�� ������� �� ���� �ݺ��ؼ� ������ �մϴ�.
		Iterator<String> iter = set.iterator(); //set�� �ݺ��� �� �ֵ��� ó��
		
		//�ݺ��� ��ü�� next()�� ���� set ������ �����͸� �ݺ��ؼ� ������ ��
		//�� �̻� ��ȸ�� �����Ͱ� ���ٸ� ���ܸ� �߻���Ű�Ƿ�
		//hashNext()�� �̿��� �� �̻� �Ҹ��� �����Ͱ� �ִ��� ���θ� Ȯ���մϴ�.
		while(iter.hasNext()) {
			String s = iter.next();
			if(s.equals("�ܹ���1")) {
				System.out.println(s);
				break;
			}
		}
		//remove(), clear() : set ������ ������ ���� ����
		set.remove("������");
		System.out.println(set);
	
		//set.clear(); //���� ���ΐb ���
		//System.out.println(set);
	
		if(set.isEmpty()) {
			System.out.println("Set�� �������");
		}else {
			System.out.println("set�� ������� ����");
		}
		
	}
}
