package interface_;

public class MainClass {

	public static void main(String[] args) {
		//�������̽� ���� ����ü�� ������ �������� ���� �� �ֽ��ϴ�.
		RemoteController rc = 
				new TVRemoteController(50);
		//RemoteController rc =
			//	new RobotCleanerRemoteController("imou", "2800")
	
	rc.turnOn();
	rc.showStatus();
	rc.turnOff();
	}
}
