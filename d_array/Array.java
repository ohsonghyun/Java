package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - int[] number = new int[5];						//뒤에 있는 [5]은 배열의 크기 저장
		 * - int[] number = new int[]{10, 20, 30, 40, 50};	//{}를 넣고 넣고 싶은 갑을 넣는다 ->배열의 크기 5
		 * - int[] number = {10, 20, 30, 40, 50};*/			//(타입생략) 5개만큼의 크기를 갖고 시작한다

		//배열은 참조형 타입이다

		int[] array;		//배열의 주소를 저장할 공간이 만들어진다
		array = new int[5];	//배열이 생성되고 그 주소가 변수에 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int[5] : int를 저장할 수 있는 5개의 공간
		//배열초기화시 기본값이 저장된다.('0'저장_모든 공간에)

		System.out.println(array);		//주소가 저장되어 있다.([I@41649a55)

		System.out.println(array[0]);	//실제값에 접근하기 위헤서는 index를 지정해줘야 한다.
		//index에는 int만 사용할 수 있다.
		//배열의 최대 크기는 int의 최대값(약 20억)이다.

		String arrayStr = Arrays.toString(array);	//( )안에 있는 값을 문자열 하나로 반환, 배열의 모든 인덱스에 저장된 값을 문자열로 반환된다
		System.out.println(arrayStr);

		int[] iArray1 = new int[]{1, 2 ,3};	//값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1, 2, 3};			//선언과 초기화를 동시에 해야한다
		//		int[] iArray3;
		//		iArray3 = {1, 2, 3};				//컴파일 에러 발생

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		//문제. 정수가 저장할 수있는 길이가 10인 배열을 생성 및 초기화 해주세요
		int[] Array = new int[10];

		//문제. 모든 인덱스에 있는 값을 변경해 주세요
		Array[0] = 10;
		Array[1] = 20;
		Array[2] = 30;
		Array[3] = 40;
		Array[4] = 50;
		Array[5] = 60;
		Array[6] = 70;
		Array[7] = 80;
		Array[8] = 90;
		Array[9] = 100;

		//문제. 모든 인덱스에 있는 값을 더해주세요
		int sum = 0;
		for(int i = 0;i < 10;i++)
			sum += Array[i];
		System.out.println(sum);

		for(int i = 0;i < array.length;i++){
			System.out.println(array[i]);
		}

		for(int i = 0;i < array.length;i++){
			array[i] = i + 1;
		}
		System.out.println(Arrays.toString(array));

		//배열의 합계와 평균을 구해보자.
		int [] numbers = new int[10];

		for(int i = 0;i < numbers.length;i++){
			numbers[i] = (int)(Math.random() *100) + 1;
		}
		System.out.println(Arrays.toString(numbers));

		sum =0 ;
		double avg = 0;
		for(int i = 0;i < numbers.length;i++){
			sum += numbers[i];
		}
		avg = (double)sum / numbers.length;
		System.out.println("합계: " + sum + "/ 평균: " + avg);

		//향상된 for문(읽기만 가능 저장할 수 없음, 값을 변경하지는 못한다, 제한적으로 사용된다)
		for(int number : numbers){	//배열에 있는 값을 차례대로 변수에 저장 후 실행한다.
			System.out.println(number);
		}

		//문제. 배열에 저장된 숫자들 중 최소값과 최대값을 출력해주세요.
		int min = numbers[0];
		int max = numbers[0];
		for(int i =0; i < numbers.length; i++){
			if(numbers[i] < min)
				min = numbers[i];
			if(numbers[i] > max)
				max = numbers[i];
		}
		System.out.println("최대값: " + max + ", 최소값: "+ min);

		int[] shuffle = new int [20];

		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));

		//배열의 값을 섞어주세요.
		for(int i = 0; i < shuffle.length * 10;i++){
			int random = (int)(Math.random() * shuffle.length);

			int temp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
		/*
		for(int i = 0; i < num.length; i++){
			num[i] = (int)(Math.random()*19);
			for(int j = 0; j < i;j++){
				if(num[i] == num[j])
					i--;
			}
		}

		System.out.println(Arrays.toString(num));
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = shuffle[num[i]];
		}
		System.out.println(Arrays.toString(shuffle));
		 */

		//문제. 1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해 주세요
		int[] number = new int[500];
		int[] count = new int[10];

		for(int i =0; i < number.length; i++){
			number[i] = (int)(Math.random() * 10) + 1;

			for(int j = 0; j < count.length; j++){
				if(number[i] == j+1){
					count[j] += 1;
				}
			}
		}
		for(int j = 0; j < count.length; j++){
			System.out.println((j+1) + "이(가) 생성된 횟수: " + count[j]);
			}
	}

}
