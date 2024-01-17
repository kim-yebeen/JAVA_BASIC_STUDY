package exceoption.trycatch;

public class TryCatchExample2 {

	public static void main(String[] args) {
		//어떤 종류가 되었건 여러분들이 직접 예외가 발생할 수 있는 구문을 작성하신 다음
		//try catch를 이용해 예외 발생시 처리되도록 프로그래밍 해보세요
		//단 0으오 나눈기를 제외한 나머지를 이용해 해주세요.
		int[] arr = {1,2,3};
		int i =0;
		while(i<4) {
			try{
				System.out.println(arr[i]);
				System.out.println("예외 발생하지 않을때만 실행됨\n");
			}catch(Exception e) {
				System.out.println("배열의 참조범위를 벗어남.\n");
			}
			finally {
				System.out.println("\n");
			}
			i++;
		}
		System.out.println("프로그램 종료");
	}
}
