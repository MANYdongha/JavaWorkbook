package basic_Java;

public class Shape_ConversionEx01 {
	public static void main(String[] args) {
		
		int num1 = 8282;
		float num2 = 1234.4321f;
		String str_1 = Integer.toString(num1);
		String str_2 = Float.toString(num2);
		
		System.out.println(str_1.getClass().getSimpleName());
		System.out.println(str_2.getClass().getSimpleName());
		System.out.printf("str_1 = %s\nstr_2 = %s", str_1, str_2);
				
		
		
		
	}
}
