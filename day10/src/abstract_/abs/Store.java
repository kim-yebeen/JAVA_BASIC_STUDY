package abstract_.abs;

public class Store extends PopupStore{

	@Override
	public void orderApple() {
		System.out.println("ÂøÁó »ç°úÁÖ½º¸¦ 20000¿¡ ÆË´Ï´Ù.");
	}

	@Override
	public void orderOrange() {
		System.out.println("ÂøÁó ¿À·»ÁöÁÖ½º¸¦ 24000¿¡ ÆË´Ï´Ù.");
	}

	@Override
	public void orderGrape() {
		System.out.println("ÂøÁó Æ÷µµÁÖ½º¸¦ 18000¿¡ ÆË´Ï´Ù");
	}

}
