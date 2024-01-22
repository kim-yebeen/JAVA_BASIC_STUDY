package api.util;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[]args) {
		int[] scores = {75,47,23,56,89};
		
						//깊은 복사를 수행하는 명령어(Arrays.copyof)
		int[] scores2 = Arrays.copyOf(scores, scores.length);
		int[] scores3 = Arrays.copyOf(scores,3);
		
		//Arrays.sort() : 배열의 데이터를 오름차순으로 정렬하는 메서드
		Arrays.sort(scores2);
		System.out.println("scores : "+Arrays.toString(scores));
		System.out.println("scores2 : "+Arrays.toString(scores2));
		System.out.println("scores3 : "+Arrays.toString(scores3));
		
		//Arrays.binarySeacr() : 배열 내부 인덱스번호를 탐색하는 메서드
		int index = Arrays.binarySearch(scores, 75);
		System.out.println("75가 저장된 인덱스 번호 : "+index);//정렬이 안되어있기 때무에 -값 반환
		
		int index2 = Arrays.binarySearch(scores2, 75);
		System.out.println("75가 저장된 인덱스 번호 : "+index2);
	
		//Arrays.equals(배열1, 배열2) : 주소 값이 아닌 배열 내부 요소 비교
		int[] arr1 = { 1,3,5,7,9};
		int[] arr2 = {1,3,5,7,9};
					//삼항 연산자, arr1과 arr2의 주소는 달라도 내부 자료만 같으면 treu
		String result = Arrays.equals(arr1, arr2)? "항목일치" : "항목 불일치";
		System.out.println(arr1.toString()+arr2.toString());
		System.out.println(arr1==arr2);
		System.out.println(result);
	}
}
