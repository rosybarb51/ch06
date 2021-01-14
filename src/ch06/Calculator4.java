package ch06;

// 일반적인 멤버를 활용한 계산기 클래스
public class Calculator4 {
	int x;
	int y;
	static int staticX = 10;
	static int staticY = 5;
	
	public void plus() {
		int result = x + y;
		System.out.println("두 수의 덧셈은 : " + result);
	}
	
	public void minus() {
		int result = x - y;
		System.out.println("두 수의 뺄셈은 : " + result);
		
	}
//	정적 멤버 메서드인 multi()는 정적 멤버 변수만 사용 가능. 멤버 변수인 x, y 사용 불가능
//	그래서 위에서 static int staticX = 10; 이라고 따로 지정해줘야한다.
	public static void multi() {
		int result = staticX * staticY;
		System.out.println("두 수의 곱셈은 : " + result);
	}
	
	public void divide() {
//		인스턴스 멤버는 정적 멤버를 사용 가능.
		int result = staticX / staticY;
		System.out.println("두 수의 나눗셈은 : " + result);
	}
}