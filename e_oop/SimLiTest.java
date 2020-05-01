package e_oop;

import java.util.Scanner;

public class SimLiTest {

	String answer;
	Scanner sc = new Scanner(System.in);
	
	
	SimLiTest(){
		answer = "yes";
	}
	
	String reply(){
		System.out.printf("입력(yes or no)> ");
		answer = sc.nextLine();
		return answer;
	}
	
	void q1(String answer){
		System.out.println("나는 *금사빠다 (*금방 사랑에 빠진다)");
		answer = reply();
		
		if(answer.equals("yes")){
			q2(answer);
		}else if(answer.equals("no")){
			q4(answer);
		}
	}
	
	void q2(String answer){
		System.out.println("연애할 때 끌리는 타입이다");
		answer = reply();
		
		if(answer.equals("yes")){
			q5(answer);
		}else if(answer.equals("no")){
			q3(answer);
		}
	}	
	
	void q3(String answer){
		System.out.println("데이트 코스는 미리 짜는게 편하다");
		answer = reply();
		
		if(answer.equals("yes")){
			q6(answer);
		}else if(answer.equals("no")){
			q5(answer);
		}
	}	
	
	void q4(String answer){
		System.out.println("감정기복이 크지 않다");
		answer = reply();
		
		if(answer.equals("yes")){
			q7(answer);
		}else if(answer.equals("no")){
			q5(answer);
		}
	}	
	
	void q5(String answer){
		System.out.println("감정표현에 솔직한 편이다");
		answer = reply();
		
		if(answer.equals("yes")){
			q8(answer);
		}else if(answer.equals("no")){
			q6(answer);
		}
	}	
	
	void q6(String answer){
		System.out.println("활동적인 데이트가 좋다");
		answer = reply();
		
		if(answer.equals("yes")){
			q8(answer);
		}else if(answer.equals("no")){
			q9(answer);
		}
	}	
	
	void q7(String answer){
		System.out.println("연락이 없어도 믿고 기다리는 편이다");
		answer = reply();
		
		if(answer.equals("yes")){
			type("A");
		}else if(answer.equals("no")){
			q8(answer);
		}
	}	
	
	void q8(String answer){
		System.out.println("이성친구는 존재할 수 없다");
		answer = reply();
		
		if(answer.equals("yes")){
			q9(answer);
		}else if(answer.equals("no")){
			type("B");
		}
	}	
	
	void q9(String answer){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
		answer = reply();
		
		if(answer.equals("yes")){
			type("D");
		}else if(answer.equals("no")){
			type("C");
		}
	}	
	
	
	void type(String tp){
		switch(tp){
		case "A":
			System.out.println("A: 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입?");
			break;
			
		case "B":
			System.out.println("B: 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
			break;
			
		case "C":
			System.out.println("C: 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
			break;
			
		case "D":
			System.out.println("D: 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
			break;
			
		}
	}
	
	
	public static void main(String[] args) {
		SimLiTest test = new SimLiTest();
		
		test.q1("yes");
	}
	
}
