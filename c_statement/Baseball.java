package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// 1~9 까지 3개의 랜덤한 숫자를 발생시킨다.
		int count = 0;

		int num1 = (int)(Math.random() * 9) + 1;
		int num2 = (int)(Math.random() * 9) + 1;
		int num3 = (int)(Math.random() * 9) + 1;

		for(;;){

			if (num1 == num2){
				num2 = (int)(Math.random() * 9) + 1;
			}else if (num1 == num3){
				num3 = (int)(Math.random() * 9) + 1;
			}else if(num2 == num3){
				num3 = (int)(Math.random() * 9) + 1;
			}else if(num1 != num2 && num1 != num3 && num2 != num3){
				break;
			}
		}
		
		do{
			count++;
			Scanner s = new Scanner (System.in);
			System.out.print("숫자1을 입력해주세요 : ");
			int input1 = Integer.parseInt(s.nextLine());
			System.out.print("숫자1을 입력해주세요 : ");
			int input2 = Integer.parseInt(s.nextLine());
			System.out.print("숫자1을 입력해주세요 : ");
			int input3 = Integer.parseInt(s.nextLine());

			int str = 0;
			int ball = 0;
			int out = 0;

			if(num1 == input1){
				str += 1;
			}
			if(num2 == input2){
				str += 1;
			}
			if(num3 == input3){
				str += 1;
			}

			if(num1 == input2 || num1 == input3){
				ball +=1;
			}
			if(num2 == input3 || num2 == input1){
				ball +=1;
			}
			if(num3 == input1 || num3 == input2){
				ball +=1;
			}

			if(num1 != input1 && num1 != input2 && num1 != input3){
				out += 1;
			}
			if(num2 != input1 && num2 != input2 && num2 != input3){
				out += 1;
			}
			if(num3 != input1 && num3 != input2 && num3 != input3){
				out += 1;
			}

			System.out.println("결과는 : " + str + "S " + ball + "B " + out + "O");
			
			if(num1 == input1 && num2 == input2 && num3 == input3){
				System.out.println(num1 + " " + num2 + " " + num3);
				System.out.println("맞췄습니다!");
				System.out.println("시도횟수는 " + count + "번 입니다.");
				break;
			}
		}while(true);
	}
}
