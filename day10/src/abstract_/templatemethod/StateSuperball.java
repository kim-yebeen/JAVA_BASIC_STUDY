package abstract_.templatemethod;

public class StateSuperball extends Lottery{

	@Override
	public void buyLottery() {
		System.out.println("미국가서슈퍼볼 복권을 삽니다.");
	}

	@Override
	public void checkWinLottery() {
		System.out.println("69c5*26c1 분의 1의 확률로 당첨되었습니다.");
	}

	@Override
	public void getLotteryMoney() {
		System.out.println("당첨 금액은 최소 수천억원입니다. ");
	}

}
