package b_operator;

public class ArithmeticOpertator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * - + : 더하기
		 * - - : 빼기
		 * - * : 곱하기
		 * - / : 나누기
		 * - % : 나머지
		 * - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 * */
		
		int a=10+20-10*5/10%2;
		// *, /, % 연산자가 +, - 보다 연산의 우선순위가 높다.
		// 우선순위가 동일한 경우 왼쪽부터 연산이 수행된다.
		System.out.println(a);
		
		double d=10+20.3;			//별 다른 형을 정해주지 않으면 int타입으로 실수는 double타입으로
		System.out.println(d);		//int + double -> double + double
		
		byte b=10;
		short c=20;
		
		a=c-b;		//최소한 4 Byte가 되어야 연산이 가능하다
		//4 Byte보다 작은 정수 타입은 4byte(int)로 형변환 후 연산이 수행된다.
		System.out.println();
		
		long e1=1000000*1000000;
		System.out.println(e1);		//오버플로우 발생, int 타입은 20억까지 표현 가능
		long e2=1000000*1000000L;
		System.out.println(e2);
		
		double f1=10/4;			//정수에 접미사를 붙이지 않으면 int로 인식
		System.out.println(f1);
		double f2=10/4.0;		//실수타입은 double로 인식
		System.out.println(f2);
		int f3=10%4;			//10을 4로 나눈 나머지
		System.out.println(f3);
		
//		int g1=10/0;		//런타임 에러 발생(실행 도중에 에러가 발생)
		
		float g2=10.0f/0;
		System.out.println(g2);
		float g3=0/0f;
		System.out.println(g3);		//NaN : Not a Number

		int h1='A'+1;
		System.out.println(h1);
		int h2='D'-'A';
		System.out.println(h2);
		int h3='5'-'0';
		System.out.println(h3);
		
		//산술연산자와 대입 연산자를 합해 연산식을 줄여서 표현할 수 있다.(복합연산자)
		int i=0;
		
		i=i+1;
		i+=1;
		i=i+2;
		i+=2;
		i=i-3;
		i-=3;
		i=i*4;
		i*=4;
		i=i/5;
		i/=5;
		i=i%2;
		i%=2;
		
		//증감연산자
		++i;		//전위형: 변수가 참조되기 전 수행
		i++;		//후위형: 변수가 참조된 후 수행
		--i;
		i--;
		
		i=0;
		System.out.println("++i="+ ++i);
		i=0;
		System.out.println("i++="+ i++);
		System.out.println(i);
		i=0;
		System.out.println("--i="+ --i);
		i=0;
		System.out.println("i--="+ i--);
		System.out.println(i);
		
		double round=50.65;
		System.out.println(Math.round(round));
		System.out.println((int)(round * 10 + 0.5) / 10.0);		//소수점 둘째 자리에서 반올림
		System.out.println(Math.round(round*10)/10.0);
		
		//문제1. 다음을 한줄씩 계산해서 푀종 결과값을 출력해주세요.
		/*
		1. 123456+654321
		2. 1번의 결과값 * 123456
		3. 2번의 결과값 / 123456 
		4. 3번의 결과값 - 654321
		5. 4번의 결과값 % 123456
		
		(int타입으로 하면 값이 제대로 나오지 않는다 -> double, float, long 타입 사용) 
		*/
		
		long no1;
		no1=123456+654321;
		//System.out.println(no1);
		no1*=123456;
		//System.out.println(no1);
		no1/=123456;
		//System.out.println(no1);
		no1-=654321;
		//System.out.println(no1);
		no1%=123456;
		System.out.println(no1);
		
		
		
		
		
		
	}

}
