package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 *비트 연산자
		 *- |, &, ^, ~, <<, >>
		 *- 비트 단위로 연산한다.(컴퓨터가 표현할 수 있는 가장 작은 단위 -> 비트)
		 *
		 *기타 연산자
		 *- .(참조연산자)	: 특정 범위 내에 속해 있는 멤버를 지정할 때 사용한다.
		 *- (type)		: 형변환(casting)
		 * (중요) - ?:(삼항연산자)	: 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 */
		
		//1byte: 01010101;(8개의 0혹은 1인 숫자, 숫자 하나하나가 비트, 비트 단위로 연산을 한다.)
		
		int x = 10;
		int y = 20;
		int result = (x < y) ? x : y;
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2이면 여자.
		int reNo = 5;
		String gender = reNo == 1 ? "남자" : "여자";
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		gender = reNo == 1 ? "남자" : (reNo == 2 ? "여자" : "확인불가");
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		//문제3. 2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		x = Integer.parseInt(s.nextLine());
		System.out.print("숫자를 입력해주세요 : ");
		y = Integer.parseInt(s.nextLine());
		result = (x > y) ? x : y;
		System.out.println("더 큰 숫자는 " + result + "입니다.");
		
		//문제4. 숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4이면 여자를 출력해주세요.
		//그 외의 숫자를 입력하면 확인불가를 출력해주세요.
		System.out.print("숫자를 입력해주세요 : ");
		x = Integer.parseInt(s.nextLine());
		gender = (x == 1 || x == 3) ? "남자 " : (x == 2 || x == 4 ? "여자" :"확인불가");
		System.out.println("당신의 성별은 " + gender + "입니다.");
	}

}
