package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Map<key, value>
		Map<String, Integer> map = new HashMap<>();
		
		//Map�� ��ü�� ���� put(key, value)
		map.put("ġŲ", 30000);
		map.put("�粿ġ", 50000);
		map.put("������", 120000);
		
		//�ߺ��� key�� �Է½�, ���� �������� ���� �ϳ��� �����
		map.put("ġŲ", 25000);
		
		System.out.println(map);
		
		//Map �� ����� key, vlaue��(entry)�� ���� ���� :size()
		System.out.println(map.size());
		
		//Map�� ����� value���� key������ ��� getKey
		int price = map.get("������"); //integer price=map.get("����Ÿ"); �� ����
		System.out.println("�������� ���� : "+price + "��");
		
		//Map���� Key�� ���� �����ϱ�
		///�ռ� ��� Set �������� ����ȴ�.
		Set<String> kSet = map.keySet();
		System.out.println(kSet);
		
		//Iterator�� �����ؼ� ����
		Iterator<String> kIte = kSet.iterator(); //Set���� ���� ����
		System.out.println("-----------");
		
		//Iterator�� while������ �ݺ�����, ��� �޴��� ���� �ֿܼ� ������.
		//xx �޴��� ������ yy���Դϴ�.
		
		while(kIte.hasNext()) {
			String menu = kIte.next();
			price = map.get(menu);
			System.out.println(menu+"�� ������ "+price+"�� �Դϴ�.");
		}
		
		//Map ���ο� �ִ� key���� ������ Ȯ�� containsKey();
		String food="ġŲ";
		
		if(map.containsKey(food)) {
			System.out.println("�츮 �Ĵ� "+food+"�˴ϴ�.");
		}else {
			System.out.println("�츮 �Ĵ� "+food+" �� �˴ϴ�.");
		}
		
		//Map ���� ������ ���ϵ����� ���� remove(key)
		//��ġ�ϴ� key���� ��Ī�� entry �� ���� ����
		map.remove("������");
		System.out.println(map);
		
		
		//Map ���� ��ü ������ �ϰ����� clear()
		map.clear();
		
		System.out.println(map);
		
		if(map.isEmpty()) {
			System.out.println("�� Map �Դϴ�.");
		}else {
			System.out.println("������� ���� Map �Դϴ�.");
		}
	}
}
