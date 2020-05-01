package DAILY_PRACTICE;

import java.util.Arrays;

public class Frist {

/*	public static void main(String[] args) {

 * 석차구하기 : 모든 점수가 1등올 시작해서 다른 점수들과비교해 자신의 점수가 작으면 1씩 증가시키는 방식
 * 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은수와 자리바꾸기를 반복해서 앞에서부터 작은 수를 채워가는 방식
 * 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은수와 자리 바꾸기를 반복해 뒤에서부터 큰 수를 채워나가는 방식
 * 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰수들을 뒤로 밀고 중간에 삽입하는 방식



		int[] numbers = new int[10];

		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(numbers));

		//석차구하기: 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		printRank(numbers);
		//선택정렬: 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와 자리바꾸기를 반복해서 앞에서부터 작은 수를 채워가는 방식
		selectSort(numbers);
		//버블정렬: 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은 수와 자리 바꾸기를 반복해 뒤에서 부터 큰 수를 채워가는 방식
		bubbleSort(numbers);
		//삽입정렬: 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고 중간에 삽입하는 방식
		insertSort(numbers);
	}

	private static void insertSort(int[] numbers) {


	}

	private static void bubbleSort(int[] numbers) {
		for(int i = 0; i < numbers.length; i++){
			for(int j = 1; j <numbers.length; j++){
				if(numbers[j-1] > numbers[j]){
					int temp = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));

	}

	private static void selectSort(int[] numbers) {
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers.length; j++){
				if(numbers[i] < numbers[j]){
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] =temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));

	}

	private static void printRank(int[] numbers) {
		int[] rank = new int[numbers.length];

		for(int i = 0; i < rank.length; i++){
			rank[i] = 1;
		}

		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j <numbers.length; j++){
				if(numbers[i] < numbers[j]){
					rank[i] += 1;
				}
			}
		}
		System.out.println(Arrays.toString(rank));

	}

}
 */
	public static void main(String[] args) {
		char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
		char[][] result = new char[star[0].length][star.length];
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				int x = j;
				int y = star.length-1-i;
				result[x][y]=star[i][j];
			}
		}
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	} // end of main
} // end of class