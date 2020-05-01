package z_exam;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 [2-1] 다음 표의 빈 칸에 개의 기본형 을 알맞은 자리에 넣으시오 8 (primitive type) .
		 크 기
		종 류		1 byte		 2 byte		 4 byte		 8 byte
		논리형	bloolean
		문자형				  char
		정수형	byte		  short		  int		  long
		실수형							  float		 double
		 */
		
		

		/*
		 [2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
		(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
		초기화 하는 한 줄의 코드를 적으시오.
		
		long reNo=9712062123456L;
		*/
		
		
		
		/*
		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
		 
		int i = 100;
		long l =100L;
		final float PI = 3.14f;
		
		- 리터럴 : 100, 100L, 3.14f
		- 변수 : i, l
		- 키워드 : int, long, final, float 
		- 상수 : PI
		*/
		
		
		
		/*
		 [2-4] 다음 중 기본형 이 아닌 것은 (primitive type) ? 
		 
		 a. int 
		 b. Byte 
		 c. double 
		 d. boolean
		 
		 정답: b. Byte: 대문자로 되어있으면 키워드가 아니다. 대문자이면 class 이름이다
		 */
		
		
		
		/*
		 [2-5] 다음 문장들의 출력결과를 적으세요 오류가 있는 문장의 경우 괄호 안에 '오류' 라고 적으시오 
		
		 System.out.println("1"+"2"); → ( 12 );
		 System.out.println(true + ""); → ( ture );
		 System.out.println('A' + 'B'); → ( 131 );	 (유니코드 표) 실제 저장되어 있는 숫자를 더한 값 
		 System.out.println('1' + 2); → ( 51 );		
		 System.out.println('1' + '2'); → ( 99 );
		 System.out.println('J' + "ava"); → ( Java );	어떤 타입이든지 문자열을 만나면 문자열로 바뀐다.
		 System.out.println(true + null); → ( 오류 ) ;
		 */
		
		
		/*
		 [2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오) 
		 
		 a. if 
		 b. True 
		 c. NULL 
		 d. Class 
		 e. System
		
		 정답: c, b, d, e
		 대문자로 되어 있으면 키워드가 아니다.
		 */
		
		
		
		/*		
		 [2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
		 
		 a. $ystem 
		 b. channel#5 
		 c. 7eleven 
		 d. If 
		 e. 자바
		 f. new : 자바에서 사용되는 키워드라서 안된다.
		 g. $MAX_NUM 
		 h. hello@com

		 정답: a, e, g, d(가능은 하다), 
		 */
		
		
		/*
		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고르시오)
		
		a. int
		b. long
		c. short
		d. float
		e. double
		
		정답: a, d
		참조형 변수 : 4 Byte
		*/
		

		/*
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
				
		a. b = (byte)i;
		b. ch = (char)b;		서로 표현 범위가 다르기 때문에 컴파일 오류가 발생한다.
		c. short s = (short)ch;
		d. float f = (float)l;
		e. i = (int)ch;
				
		정답: d, e
		표현범위가 작은쪽에서 큰쪽으로 형변환을 할 때 생략이 가능하다. c번은 short는 -범위까지 표현해야하고, char은 문자타입이라 마이너스 범위는 표현하지 않는다.
		*/

		
		/*
		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
		
		0~65535
		 */
		
		
		
		/*
		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
		
		a. byte b = 256;		표현범위를 넘었다 127까지 가능	
		b. char c = '';			문자는 반드시 한개의 문자를 표현해야 한다
		c. char answer = 'no';	문자이지만 두개의 문자가 들어가있다.
		d. float f = 3.14		f가 빠져있다
		e. double d = 1.4e3f;	f를 사용해도 상관이 없다.(형변환 생략 가능)
		
		정답: a, b, c, d
		 */
		
		
		
		/*
		[2-12] 다음 중 main메서드의 선언부로 알맞은 것은? (모두 고르시오)
		
		a. public static void main(String[] args)
		b. public static void main(String args[])
		c. public static void main(String[] arv)
		d. public void static main(String[] args)
		e. static public void main(String[] args)
				
		정답: a
		*/
		
		
		/*
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
		 
		a. boolean - false
		b. char - '\u0000'
		c. float - 0.0		뒤에 f를 붙여주지 않았다
		d. int - 0
		e. long - 0			뒤에 l
		f. String - ""		NULL값
			
		정답: c, e, f
		 */
	}

}
