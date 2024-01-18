package api.lang._system;

public class SystemTimeExample {

	public static void main(String[] args) {
		/*
		 * currentTimeMillis()와 nanoTime() 메서드는 UNIX 시간을 사용한다.
		 * Unix 시간이란 1970년도 1월 1일 --시 --분 00초를 기점으로
		 * 얼마나 시간이 지났는지를 숫자로 표현하는 체게이다.
		 * 현재까지의 시간을 1000분의 1초로 변환한 에폭시간과
		 * 현재까지의 시간을 10억분의 1로 변환한 에폭시간을 long타입으로 리턴한다.
		 */
		long start = System.currentTimeMillis();//메서드의 리턴타입이 long
		System.out.println("시작시간 : "+start);
		long sum=0;
		
		for(long i=1; i<10_000_000_000L; i++) {
			sum +=i;
		}
		long end = System.currentTimeMillis();
		System.out.println("종료 시간 : "+end);
		System.out.println("계산에 소요된 시간 : "+(end-start));
	}
}
