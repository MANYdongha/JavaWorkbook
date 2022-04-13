package basic_Java;

import java.util.Scanner;

public class Control02 {
	public static void main(String[] args) {
		//숫자들을 암호화하고자 합니다. 
//		1000이하의 수들은 2진법으로 바꾼후 이를 다시 
//		8진법으로 해석한 수로 100을 넘는 수들은 
//		8진접으로 바꾼후 다시 이를 16진법으로 해석한 수로 암호화한다.
		Scanner sc = new Scanner(System.in);
		
		
		String result = null;
		String count;
		String num2;
		String num8;
		
		System.out.println("함호화할 정수입력 : ");
		int num = sc.nextInt();
		
		while(true) {
			if(num != 1) {
				num /= 2;
				result = Integer.toString(num % 2);
				
				
			}
			else {
				break;
			}
			System.out.print(num + " " );
			System.out.print(result + " ");
		}
		
		
		
	
	
	
	}
}
