package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교 연산자
		 * - <, >, <=, >=, ==, !=
		 * - 문자열 비교: equals()
		 */
		
		boolean b= 10<20;		//비교연산자의 연사결과는 boolean이다.
		System.out.println(b);
		b= 10<=20-15;			//산술연산 후 비교연산을 수행한다.
		System.out.println(b);
		b="abc"=="abc";			//값을 비교하는 것이 아니라 주소를 비교하는 중
		System.out.println(b);
		b="abc"==new String("abc");		//new라는 아이가 새로운 주소를 생성하는 것이기 때문에 주소가 달라진다.
		System.out.println(b);
		b= "abc".equals(new String("abc"));		//equals를 사용해서 비교를 하면 값을 비교한다.
		System.out.println(b);
		b= !"abc".equals("abc");		//같지 않다의 결과를 얻기 위해서는 !(NOT)을 앞에 붙여준다.
		System.out.println(b);
		
		//문제2. int타입의 x와 y 변수를 만들고, 다음의 문장들을 코드로 작성해 주세요.

		int x=10;
		int y=20;
		boolean result;
		
		//1. x가 y보다 크다.
		result=x>y;
		System.out.println(result);
		
		//2. x는 y보다 작다.
		result=x<y;
		System.out.println(result);
		
		//3. x+5와 y는 같다.
		result=x+5==y;
		System.out.println(result);
		
		//4. x는 3의 배수이다.
		result=x%3==0;
		System.out.println(result);
		
		//5. y는 홀수이다.
		result=y%2==1;
		System.out.println(result);
		
		//6. x와 3y는 다르다.
		result=x!=3*y;
		System.out.println(result);
		
		//7. "변수"와  "데이터"는 같다.
		result="변수".equals("데이터");
		System.out.println(result);
		
		//8. "기본형"과 "참조형"은 다르다.
		result=!"기본형".equals("참조형");
		System.out.println(result);
		
		
	}

}
