package ch06;

public class CalculatorMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator8 cal8 = new Calculator8();
		System.out.println("가로가 10인 정사각형의 넓이는 : " + cal8.areaRectangle(10));
		System.out.println("가로가 10이고 세로가 5인 직사각형의 넓이는" + cal8.areaRectangle(10.0, 5.0));
	
	
	System.out.println("---- 오버로딩 ----");
	
	Calculator9 cal9 = new Calculator9(); 
	System.out.println("정수 2개를 입력하는 덧셈 : " + cal9.plus(10, 5));
	System.out.println("정수 1개와 실수 1개를 입력하는 덧셈 : " + cal9.plus(10, 5.0));
	System.out.println("실수 1개와 정수 1개를 입력하는 덧셈 : " + cal9.plus(10.0, 5));
	System.out.println("실수 2개를 입력하는 덧셈 : " + cal9.plus(10.0, 5.0));
	
	}
}
