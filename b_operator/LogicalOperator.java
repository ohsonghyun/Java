package b_operator;

public class LogicalOperator {
	public static void main(String[] args) {
		/*
		 * 논리연산자 
		 * - &&(And), ||(OR), !(NOT)
		 * - 피연산자로 boolean만 허용한다.
		 */
		
		boolean b;
		
		b = true && true;	//true
		b = true && false;	//false
		b = false && true;	//false
		b = false && false;	//false
		
		b = true || true;	//true
		b = true || false;	//true		Dead code: 실행을 해도 값을 얻을 수 없다(이유: 왼쪽만으로도 값이 정해지기 때문에 오른쪽을 무시한다는 뜻)
		b = false || true;	//true
		b = false || false;	//false
		//왼쪽에 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		
		int i = 5;
		//0 < i < 10
		b = 0 < i && i < 10;
		System.out.println(b);
		//산술 논리 비교
		
		b = i > 10 || i % 2 == 0;
		System.out.println(b);
		
		int d= 10;
		b= d < 10 && 0 < d++;	//왼쪽 연산만으로도 값이 false가 정해지기 때문에 오른쪽 연산은 수행하지 않기 때문에 d++이 되지 않았다.
		System.out.println(d);
		
		b = !b;	//피연산자의 앞에 !을 붙인다. 		b가 true이면 false를 false 이면 true를 저장한다.
		b = !(10 < 20);
		
		
		
		
	}
}
