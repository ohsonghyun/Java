package c_statement;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		
		 Scanner s = new Scanner(System.in);
		 System.out.println("숫자를 입력해 주세요");
		 int input1 = Integer.parseInt(s.nextLine());
		 System.out.println("연산자를 입력해 주세요. (+, -, *, /, %)");
		 String operator = s.nextLine();
		 System.out.println("숫자를 입력해 주세요");
		 int input2 = Integer.parseInt(s.nextLine());
		 float result = 0;
		
		 
		 if(operator.equals("+")){
			 result = input1 + input2;
		 }else if(operator.equals("-")){
			 result = input1 - input2;
		 }else if(operator.equals("*")){
			 result = input1 * input2;
		 }else if(operator.equals("/")){
			 result = (float)(input1 / input2);
		 }else if(operator.equals("%")){
			 result = input1 % input2;
		 }
		
		
		 System.out.println("정답: " + result);
		
		
		
		 System.out.println("숫자를 입력해 주세요");
		 input1 = Integer.parseInt(s.nextLine());
		 System.out.println("연산자를 입력해 주세요. (+, -, *, /, %)");
		 operator = s.nextLine();
		 System.out.println("숫자를 입력해 주세요");
		 input2 = Integer.parseInt(s.nextLine());
		 result = 0;
		
		 switch (operator){
		 case "+":
			 result = input1 + input2;
		 case "-":
			 result = input1 - input2;
		 case "*":
			 result = input1 * input2;
		 case "/":
			 result = input1 / input2;
		 case "%":
			 result = input1 % input2;
		 }
		
		 System.out.println("정답: " + result);
		
	}

}
