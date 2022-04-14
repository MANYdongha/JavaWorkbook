package basic_Java;

import java.util.Scanner;

public class Control05 {
	public static void main(String[] args) {
		//하나의 정수를 입력받아 음수인지 양수인지
		//홀수인지 짝수인지 
		//3의 배수인지 5의 배수인지 판별
		
		Scanner sc= new Scanner(System.in);
		System.out.println("정수를 입력하시오 ");
		int num = sc.nextInt();
		
		boolean result;
		
		if(num == 0) {
			System.out.println("num : 0입니다.");
		}
		else {
			String type = num > 0 ? "양수" : "음수";
			String kind = num % 2 == 0 ? "짝수" : "홀수";
			String dra1 = num % 3 == 0 ? "3의배수입니다." : "3의배수가아닙니다.";
			String dra2 = num % 5 == 0 ? "5의배수입니다." : "5의배수가아닙니다.";
		
			System.out.printf("type : %s \nkind : %s \ndra1 : %s \ndra2 : %s", type, kind, dra1, dra2 );
		}
		
		
		
		
		
		
	}
}
