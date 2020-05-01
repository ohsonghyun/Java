package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 석차구하기 : 모든 점수가 1등으로 시작해서 다른 점수들과비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		 * 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은수와 자리바꾸기를 반복해서 앞에서부터 작은 수를 채워가는 방식
		 * 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은수와 자리 바꾸기를 반복해 뒤에서부터 큰 수를 채워나가는 방식
		 * 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰수들을 뒤로 밀고 중간에 삽입하는 방식
		 */

		int[] numbers = new int[10];

		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(numbers));


//		printRank(numbers);		//석차구하기
//		selectSort(numbers);	//선택정렬
//		bubbleSort(numbers);	//버블정렬
		insertSort(numbers);	//삽입정렬
	}

	private static void insertSort(int[] numbers) {
		for(int i = 1; i < numbers.length; i++){
			int temp = numbers[i];
			for(int j = i - 1; j >= 0 ;j--){
				if(temp < numbers[j]){
					numbers[j+1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		
		/*
		for(int i = 1; i < numbers.length; i++){
			int temp = numbers[i];
			int j;
			for(j = i - 1; j >= 0 ;j--){
				if(temp < numbers[j]){
					numbers[j+1] = numbers[j];
				}else{
					break;
				}
			}  
			numbers[j + 1] = temp;
		}
		*/
	}

	private static void bubbleSort(int[] numbers) {
		for(int i = 0; i < numbers.length; i++){
			for(int j = 1; j < numbers.length - i; j++ ){
				if(numbers[j-1] > numbers[j]){
					int temp = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		
		/*
		for(int i = 0; i < numbers.length - 1; i++){
			boolean changed = false;
			for(int j = 0; j < numbers.length - 1 - i; j++ ){
				if(numbers[j] > numbers[j+1]){
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					changed = true;
				}
			}
			if(!changed){
				break;
			}
		}
		*/
	}

	private static void selectSort(int[] numbers) {
		int temp;
		int[] sort = new int[numbers.length];
		for(int i = 0; i < sort.length; i++){
			for(int j = i; j < sort.length ; j++){
				if(numbers[i] > numbers[j]){
					temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
					sort[i] = numbers [i];
				}else if(i == 9){
					sort[i] = numbers[i];
				}
			}
		}
		System.out.println(Arrays.toString(sort));
		
		/*
		for(int i = 0;i < numbers.length - 1;i++){
			for(int j = i + 1; j < numbers.length; j++){
				if(numbers[i] > numbers[j]){
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		*/
	}

	private static void printRank(int[] numbers) {
		int[] rank = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

		//		int[] rank = new int[numbers.length];
		//		for(int i =0; i < rank.length; i++)
		//			rank[i] = 1;

		for(int i = 0;i < rank.length;i++){
			for(int j =0; j <rank.length; j++){
				if(numbers[i] < numbers[j]){
					rank[i] +=1;
				}
			}
		}
		for(int i = 0; i < rank.length; i++){
			System.out.println(i+1 + "의 등수는 " + rank[i] + "등 이고, " + numbers[i] + "점 입니다." );
		}
	}

}
