package ch06;

public class Calculator5 {
	int x;
	int y;
//	static에 초기화값 안줘도 되는데 테스트를 위해서 줬따.
	static int staticX = 0;
	static int staticY = 0;
	
	public void plus() {
		int result = x + y;
		System.out.println("두 수의 덧셈은 : " + result);
	}
	
	public static void staticPlus() {
		int result = staticX + staticY;
		System.out.println("두 수의 덧셈은 : " + result);
	}
}