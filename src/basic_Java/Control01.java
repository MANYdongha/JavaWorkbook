package basic_Java;

import java.util.Scanner;

public class Control01 {
	public static void main(String[] args) {
		//학생의 학점을 입력받아 
		//학점이 A와 B인 학생에게 "참잘했습니다" 
		//학점이 C와 D인 학생에게 "좀더노력하세요"
		//학점이 F인 학생에게 "다음학기에 다시 수강하세요"
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("등급을 입력해주세요 A, B, C, F");
			String rank = sc.next();
			if(rank.equals("A") || rank.equals("B") ) {
				System.out.println("참잘했습니다");
				break;
			}
			else if (rank.equals("c")) {
				System.out.println("좀더노력하세요");
				break;
			}
			else if(rank.equals("F")) {
				System.out.println("다음학기에 다시 수강하세요");
				break;
			}
			else {
				System.out.println("잘못된 입력입니다. 다시입력하세요");
			}
		}
		
		
		
		sc.close();
	}
}
