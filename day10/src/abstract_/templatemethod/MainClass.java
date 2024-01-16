package abstract_.templatemethod;

public class MainClass {

	public static void main(String[] args) {
		Lottery lottery = new StateSuperball();
		
		lottery.lotteryCycle();
	}
}
