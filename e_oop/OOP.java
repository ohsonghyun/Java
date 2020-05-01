package e_oop;

import java.util.Arrays;
import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		/*
		 * OOP(Object Oriented Programming) : 객체지향 프로그래밍
		 * - 프로그래밍을 당순히 코드의 연속으로 보는 거이 아니라 객체간의 상호작용으로 보는 것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다
		 * 
		 * 객체 지향(이스턴스화)
		 * - 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓는 것
		 * - new 클래스명(); -> 객체가 지정된 메모리 주소 변환
		 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다
		 * - 객체는 생성될 때마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다
		 */
		
		//객체생성, 변수에 저장
		SampleClass sc = new SampleClass();
		
		sc.method1();	//메서드 호출(일 하라고 명령하는 것)
		
		//파라미터에 맞는 값을 넣어주고, return 타입의 값을 변수에 저장해 준다.
		String returnValue = sc.method2(5);
		
		System.out.println(returnValue);
		
		sc.flowTest1();
		
		Calculator cal = new Calculator();
		
		double add = cal.add(123456, 654321);
		double mul = cal.mul(add, 123456);
		double divi = cal.divi(mul, 123456);
		double sub = cal.sub(divi, 654321);
		double rest = cal.rest(sub, 123456);
		
		System.out.println(rest);
		
		/*
		 * 과제. MyMath 클래스와 아래의 메서드들을 만들어주세요.
		 * - 가장 큰 값
		 * - 가장 작은 값
		 * - 원하는 자릿수에서 반올림
		 * - int배열 정렬(오름차순, 내림차순 둘 다 가능하게)
		 * - SampleClass의 변수값을 출력(파라미터 1개만 사용) 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num1[] = new int[]{1,2,3,7,3,4,7,2,5,8,10}; 
		double num2[] = new double[]{1,2,3,7,3,4,7,2,5,8,10};
		double number = 239.3678;
		int count = 2;
		MyMath math = new MyMath();
		
		System.out.println("배열 정렬 방법을 선택하시오.(올림/내림)");
		String select = scan.nextLine();
		for(;;){
			if(select.equals("올림") || select.equals("내림")){
				System.out.println(Arrays.toString(math.array(num1,select)));
				break;
			}else{
				System.out.println("잘 못 입력하셨습니다. 다시 입력하세요.(올림/내림)");
				select = scan.nextLine();
			}
		}
		
		System.out.printf("가장 큰 값은? ");
		System.out.println(math.maximum(num2));
		
		System.out.println("가장 작은 값은? ");
		System.out.println(math.minimum(num2));
		
		System.out.println((float) Math.pow(10, count));
		
		
		System.out.println(math.round(number, count));
		
		
	}
	

}
