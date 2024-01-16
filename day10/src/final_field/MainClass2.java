package final_field;

import java.util.Arrays;

public class MainClass2 {

	public static void main(String[] args) {
		Collector c1= new Collector();
		
		System.out.println(Arrays.toString(c1.stickers));

		c1.stickers[0]="ÆÄÀÌ¸®";
		
		System.out.println(c1.stickers);
	}
}
