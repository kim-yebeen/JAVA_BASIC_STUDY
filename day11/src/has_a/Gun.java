package has_a;

public class Gun {

	private int bullet; //ÃÑ¾Ë °¹¼ö
	private String modelName; //ÃÑ±â ¸ðµ¨¸í
	private String gunNumber; //ÃÑ¹ø

	public Gun(String modelName, String gunNumber) {
		this.bullet=5;
		this.modelName=modelName;
		this.gunNumber=gunNumber;
	}
	
	public void shoot() {
		if(this.bullet>0) {
			this.bullet--;
			System.out.println("ÃÑÀ» ½ú½À´Ï´Ù.");
		}else {
			System.out.println("¹æ¾Æ¼è¸¦ ´ç°åÁö¸¸ ÃÑ¾ËÀÌ ¾ø½À´Ï´Ù.");
		}
	}
	public void reload() {
		this.bullet=5;
	}
}
