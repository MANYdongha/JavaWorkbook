package basic_Java;

import java.util.Scanner;

public class For01 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("정수입력 : ");
		int result = 10;
		int num = sc.nextInt();
		
		for(int i = 2; i<num; i++) {
		//	System.out.println(num+" 1");
			if((num % i == 0)){
				
				System.out.println(result);
				result = 0;
				break;
			}
			else {
				System.out.println(result);
				break;
				
			}
		}
		System.out.println(num);
		System.out.println(result);
		switch (result) {

		case 0:
			System.out.println("소수가 아닙니다.");
			break;
			
		default :
			System.out.println("소수입니다.");
		}
		
		
		sc.close();
	}
}
