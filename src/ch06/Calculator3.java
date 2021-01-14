package ch06;

// 정적 멤버를 활용한 계산기 클래스
public class Calculator3 {
	static int x;
	static int y;
	
	public static void plus() {
		int result = x + y;
		System.out.println("두 수의 덧셈은 : " + result);
	}


	public static void minus() {
		int result = x - y;
		System.out.println("두 수의 뺄셈은 : " + result);
	}
	
}