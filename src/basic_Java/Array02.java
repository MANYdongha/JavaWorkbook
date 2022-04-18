package basic_Java;
//신용카드 16자리를 Luhn 알고리즘에 의해 검증하는 코드를 작성하고
		// 입력된 카드번호가 유효한 번호인지, 유효하지 않은 번호인지 출력하세요
		// 문자열 함수를 이용하지 않고, arr 를 이용하여 코드를 진행하세요
		// '0'의 아스키코드는 48번입니다

import java.util.Scanner;

// 1) 우측부터 세어서 홀수번째는 그대로 두고, 짝수번째는 2를 곱한다
		// 2) 만약 2를 곱했을때 두자리수가 된다면 각 자릿수를 더하여 한자리수로 만든다
		// 3) 이렇게 만들어진 16개의 정수를 모두 합하여 그 합이 10으로 나누어떨어지면 유효한 번호
public class Array02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("카드번호 16자리 입력 : ");
		char[] arr = sc.nextLine().toCharArray();
		int tmp1 = 0;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
		
		}System.out.println();
	
	
		String str1 = String.valueOf(arr[0]);
		int result1 = Integer.parseInt(str1);
		String str2 = String.valueOf(arr[2]);
		int result2 = Integer.parseInt(str2);
		System.out.println();
		System.out.println(result1 + result2);
		System.out.println();

		for(int i=15; i>=0; i--) {
			String str = String.valueOf(arr[i]);
			int result = Integer.parseInt(str);
			System.out.print(result + " ");
			System.out.println("i = " + i);
			if(i % 2 != 0) {
				result *= 2;
				System.out.println("result = " + result);
				if(10<=result) {
					tmp1 = result % 10;
					result = tmp1 + 1;
					
				}
				
			}
			sum += result; 
			System.out.println("sum = " + sum);
			
		}
		System.out.println();
		System.out.println("총합 = " + sum);
		System.out.println(sum % 10 ==0 ? "유효한번호" : "유효하지 않은 번호");
		
	sc.close();
		
		
	}
}
