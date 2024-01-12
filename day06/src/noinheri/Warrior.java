package noinheri;

public class Warrior {
	//���� ���� ����
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	//�����ڸ� ������ּ���. id�� �Է¹ް�
	//������ �ʵ� -ü���� 20, ���ݷ� 3, ���� 1, ����ġ 0���� �ʱ�ȭ�մϴ�.
	public Warrior(String id) {
		this.id=id;
		this.hp=20;
		this.atk=3;
		this.def=1;
		this.exp=0;
	}
	//ĳ���� ���°� ��ȸ ������ showStatus()�� �����ڽ��ϴ�.
	//�� �޼���� ������� ������ �ֿܼ� ����ݴϴ�.
	public void showStatus() {
		System.out.println("���̵� : "+this.id);
		System.out.println("ü�� : "+this.hp);
		System.out.println("���ݷ� : "+this.atk);
		System.out.println("���� : "+this.def);
		System.out.println("ȹ�����ġ : "+this.exp);
		System.out.println("--------------------");
	}
	
	//�ܵ� ����� �ϵ��� �޼��带 ����ϴ�.
		public void huntRabbit(Rabbit rabbit) {
			if(rabbit.getHp()<=0) {
				System.out.println("�̹� ���� �䳢�Դϴ�.");
				return; //���� �䳢�� ���ؼ��� �߰� ������ �ʿ� ����
			}
			//1. ���� ������ �䳢�� ü���� 3 ����ϴ�.
			rabbit.setHp(rabbit.getHp()-this.atk);
			//2. ��� �������� �׿��ٸ� ����ġ 5 ����
			if(rabbit.getHp()<=0) {
				System.out.println("�䳢�� �׿����ϴ�.");
				this.exp+=5;
			}else {
				System.out.println("�䳢�� �����߽��ϴ�.");
			}
		}
		public void huntRat(Rat rat) {
			if(rat.getHp()<=0) {
				System.out.println("�̹� ���� ���Դϴ�.");
				return; //���� �㿡 ���ؼ��� �߰� ������ �ʿ� ����
			}
			//1. ���� ������ ���� ü���� 3 ����ϴ�.
			rat.setHp(rat.getHp()-this.atk);
			//2. ��� �������� �׿��ٸ� ����ġ 5 ����
			if(rat.getHp()<=0) {
				System.out.println("�㸦 �׿����ϴ�.");
				this.exp+=5;
			}else {
				System.out.println("�㸦 �����߽��ϴ�.");
				System.out.println("�㰡 �ݰ��մϴ�.");
				this.hp=this.hp-rat.getAtk();
			}
		}
}
