package interface_;

public class RobotCleanerRemoteController implements RemoteController{

	public String modelName;
	public String price;
	
	//�κ�û�ұ� ������
	public RobotCleanerRemoteController(String modelName, String price) {
		this.modelName = modelName;
		this.price = price;
	}
	@Override
	public void turnOn() {
		System.out.println("�κ�û�ұ⸦ �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("�κ�û�ұ⸦ ���ϴ�.");
	}

	//�κ� û�ұ⿡���� �κ�û�ұ⿡ �´� ������ȸ
	@Override
	public void showStatus() {
		System.out.println("�𵨸� : "+this.modelName);
		System.out.println("���� : "+this.price);
	}

}
