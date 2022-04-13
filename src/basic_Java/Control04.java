package basic_Java;

import java.util.Scanner;

public class Control04 {
	public static void main(String[] args) {
		//3개 의 정수를 입력받아서 작은 숫자 호출하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력 : ");
		int small;
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		small = num1 > num2 ? num2 : num1;
		int small2 = small > num3 ? num3 : small; 	
	   
		  
		System.out.println(small2);
		 
		 
		
		
		
		
		sc.close();
		
		
		
		
	}
}
