package basic_Java;

import java.util.Scanner;

public class Control02 {
	public static void main(String[] args) {
		//숫자들을 암호화하고자 합니다. 
//		1000이하의 수들은 2진법으로 바꾼후 이를 다시  8진법으로 해석 
//		1000을 넘는 수들은  8진법으로 바꾼후 다시 이를 16진법으로 해석한 수로 암호화한다.
 		
		Scanner sc = new Scanner(System.in);
		
		
		String level1;	//Integer.toBinarySting() , Integer.toHexString()에 저장할 값들을 받을 변수
		int level2;
		
		System.out.println("함호화할 정수입력 : ");
		int num = sc.nextInt();
	
		if(num < 1000) {
			level1 = Integer.toBinaryString(num);	//2진법 : 문자열을 2진법으로 변경해서 받아온다. 
			level2 = Integer.parseInt(level1, 8);	//8진법 : 문자열을 8진법으로 변경해서 받아준다.
			
		}
		else {
			level1 = Integer.toOctalString(num);	//8진법 : 문자열을 8진법으로 변경해서 받아온다.
			level2 = Integer.parseInt(level1, 16);	//16진법 : 문자열을 16진법으로 변경해서 받아준다.
			
		}
		System.out.println("검색한 정수 : " + num );
		System.out.println("level1 : " + level1 );
		System.out.println("level2 : " + level2 );
		
		// Integer.toBinaryString(num) = 입력받은 수를 2진법 문자열로 변경
		// Integer.toOctalString(num) = 입력받은 수를  8진법 문자열로 변경
		// Integer.toHexString(num)	= 입력받은 수를 16진법 문자열로 변경
		
		// Integer.perseInt(진법으로 바꾼 문자열, ?(몇진법으로 바꿀 것인지?)) 
		// = 해당문자열의 진법을 정수진법으로 바꾼다.
	
		
	}// main끝
}
