package super__;

import super_.SupersonicAirplane;

public class AirplaneMain {
	public static void main(String[] args) {
		SupersonicAirplane as1 = new SupersonicAirplane("KE1010");
		
		for(int i=0;i<8;i++) {
			as1.fly();
		}
		as1.showStatus();
		System.out.println("-------------");
		for(int i = 0; i < 8 ; i++) {
			as1.fly();
		}// �ӵ� 800, ���� 76
		
		as1.showStatus();
		System.out.println("-------------------");
		for(int i = 0; i < 4; i++) {
			as1.fly();
		}
		as1.showStatus();
		
	}
	

}
