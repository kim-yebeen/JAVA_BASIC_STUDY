package noinheri;

public class Rat {
	//쥐 몬스터를 만듭니다.
		// 쥐는 hp, atk, def
		private int hp;
		private int atk;
		private int def;
		
		//체력 5, 공격력 1, 방어력 0으러
		public Rat() {
			this.hp=5;
			this.atk=1;
			this.def=0;
		}
		
		//setter, getter 자동생성
		// alt+shift+s 혹은 우클릭 -> source
		//generate getters and setters 선택 

		public int getHp() {
			return hp;
		}

		public void setHp(int hp) {
			this.hp = hp;
		}

		public int getAtk() {
			return atk;
		}

		public void setAtk(int atk) {
			this.atk = atk;
		}

		public int getDef() {
			return def;
		}

		public void setDef(int def) {
			this.def = def;
		}

}
