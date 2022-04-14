package basic_Java;

import java.util.Scanner;

public class loop2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장입력 : ");
		String enter = sc.nextLine();
		
		
		for(int i = 0; i<enter.length(); i++) {
			for(int j =0; j<=i; j++) {
				System.out.print(enter.charAt(j));
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
