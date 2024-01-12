package inheri;

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
	
	//�Ķ���ͷ� ��� ������ �θ�Ÿ���� Monster�ν��Ͻ��� �䱸�ϸ�
	//������ ������ ���ؼ� ��ӹ��� ��� ���͸� �� ������ �� �ֽ��ϴ�.
	public void hunt(Monster monster) {
		//���� ���ʹ� ���� �Ұ� �� �޼��� ��� ����
		if(monster.getHp()<=0) {
			System.out.println(monster.getName()+"��(��) �̹� �׾ ������ �� �����ϴ�.");
			return;
		}
		//���� �������� ���Ͱ� �״� ���
		if(monster.getHp()-(this.atk-monster.getDef())<=0) {
			//����ġ �ο�
			monster.setHp(0);
			System.out.println(monster.getName()+"��(��) �׾����ϴ�.");
			this.exp+=monster.getExp();
		}
		else 			//���� �������� ���Ͱ� ���� �ʾƼ� �ݰ��� �޴� ��� 
		{
			//���� ü���� �� ���ݷ�-���͹��� ��ŭ �����ϰ�
			monster.setHp(this.atk-monster.getDef());
			//�� ü���� ���� ���ݷ�- �� ���� ��ŭ �����ϰ�
			this.hp-=monster.getAtk()-this.def;
			//***��(��) �ݰ��߽��ϴ�.
			System.out.println(monster.getName()+"��(��) �ݰ��߽��ϴ�.");
		}
		
		
	}
	
}
