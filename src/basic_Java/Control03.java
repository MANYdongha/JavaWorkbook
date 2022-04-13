package basic_Java;

import java.util.Scanner;

public class Control03 {
	public static void main(String[] args) {
		//영어문장을 1개 입력받는데 시작하는 알파벳이 모음이면 Good sentence로 출력되서 나오게 해라.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영어문장 작성 : ");
		String str = sc.nextLine();
		
		System.out.println(str);
		str = str.toLowerCase();		//대문자를 소문자로 변경시키는 함수
		
		int n_a = str.indexOf('a');		//문자열 인덱스를 통해 값이 있으면 int 형태로 저장
		int n_e = str.indexOf('e');
		int n_i = str.indexOf('i');
		int n_o = str.indexOf('o');
		int n_u = str.indexOf('u');
		if(n_a == 0 || n_e ==0 || n_i ==0 || n_u ==0 || n_o ==0) {
			System.out.println("Good Sentence");
		}
		
		
		
		sc.close();
	}//main 끝
}
