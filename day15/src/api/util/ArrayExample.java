package api.util;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[]args) {
		int[] scores = {75,47,23,56,89};
		
						//���� ���縦 �����ϴ� ��ɾ�(Arrays.copyof)
		int[] scores2 = Arrays.copyOf(scores, scores.length);
		int[] scores3 = Arrays.copyOf(scores,3);
		
		//Arrays.sort() : �迭�� �����͸� ������������ �����ϴ� �޼���
		Arrays.sort(scores2);
		System.out.println("scores : "+Arrays.toString(scores));
		System.out.println("scores2 : "+Arrays.toString(scores2));
		System.out.println("scores3 : "+Arrays.toString(scores3));
		
		//Arrays.binarySeacr() : �迭 ���� �ε�����ȣ�� Ž���ϴ� �޼���
		int index = Arrays.binarySearch(scores, 75);
		System.out.println("75�� ����� �ε��� ��ȣ : "+index);//������ �ȵǾ��ֱ� ������ -�� ��ȯ
		
		int index2 = Arrays.binarySearch(scores2, 75);
		System.out.println("75�� ����� �ε��� ��ȣ : "+index2);
	
		//Arrays.equals(�迭1, �迭2) : �ּ� ���� �ƴ� �迭 ���� ��� ��
		int[] arr1 = { 1,3,5,7,9};
		int[] arr2 = {1,3,5,7,9};
					//���� ������, arr1�� arr2�� �ּҴ� �޶� ���� �ڷḸ ������ treu
		String result = Arrays.equals(arr1, arr2)? "�׸���ġ" : "�׸� ����ġ";
		System.out.println(arr1.toString()+arr2.toString());
		System.out.println(arr1==arr2);
		System.out.println(result);
	}
}
