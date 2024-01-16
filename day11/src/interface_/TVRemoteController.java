package interface_;

public class TVRemoteController implements RemoteController{

	private final int inch;
	private int channel;
	public TVRemoteController(int inch) {
		this.inch = inch;
		this.channel = 1;
	}
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void showStatus() {
		System.out.println("ȭ�� ũ�� : "+this.inch);
		System.out.println("���� ä�� : "+this.channel);
	}

	public void setChannelDown() {
		//1�������� ä���� ����
		if(this.channel-1<1) {
			this.channel=1;
		}else {
			this.channel--;
		}
	}
	
	public void setChannelUp() {
		this.channel++;
	}
}
