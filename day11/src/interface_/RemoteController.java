package interface_;

public interface RemoteController {

	//�ִ� ���͸���, �ּ� ���͸����� ����� ����
	int MAX_BATTERY = 100;
	int MIN_BATTERY=0;
	
	//�������� ������ �ϴ� �ʼ� ��ɿ� ���ؼ��� ����
	public void turnOn();
	
	public void turnOff();
	
	public void showStatus();
}
